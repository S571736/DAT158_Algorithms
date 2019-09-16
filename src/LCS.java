public class LCS {

    public static String recusiveLCS(String X, String Y) {
        int lengthX = X.length();
        int lengthY = Y.length();

        if (lengthX == 0 || lengthY == 0) {
            return "";
        } else if (X.charAt(lengthX - 1) == Y.charAt(lengthY - 1)) {
            return recusiveLCS(X.substring(0, lengthX - 1), Y.substring(0, lengthY - 1)) + X.charAt(lengthX - 1);
        } else {
            String x = recusiveLCS(X, Y.substring(0, lengthY - 1));
            String y = recusiveLCS(X.substring(0, lengthX - 1), Y);
            return (x.length() > y.length()) ? x : y;
        }

    }

    public static int dynamicLCS(String X, String Y) {
        int lengthX = X.length();
        int lengthY = Y.length();
        int[][] L = new int[lengthX + 1][lengthY + 1];

        for (int i = 0; i <= lengthX; i++) {
            for (int j = 0; j <= lengthY; j++) {
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    L[i][j] = 1 + L[i - 1][j - 1];
                } else {
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }
        return L[lengthX][lengthY];
    }

    public static void main(String[] args) {
        String stringX = "babbabab";
        String stringY = "bbabbaaab";

        String lengste = recusiveLCS(stringX, stringY);
        int lcs = lengste.length();
        System.out.println("Rekursiv løsning: " + lcs + "\n");
        System.out.println("Dynamisk løsning: " + dynamicLCS(stringX, stringY) + "\n");

    }


}
