import java.security.SecureRandom;

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

    public static String generateString(int length) {
        final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
        final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
        final String NUMBER = "0123456789";

        final String DATA_FOR_RANDOM_STRING = CHAR_LOWER + CHAR_UPPER + NUMBER;
        SecureRandom random = new SecureRandom();

        if (length < 1) throw new IllegalArgumentException();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
            char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);
            sb.append(rndChar);
        }
        return sb.toString();
    }

    public static void dynamicTimer(String X, String Y) {

        long startTime = System.currentTimeMillis();
        dynamicLCS(X, Y);
        long tid = System.currentTimeMillis() - startTime;


        System.out.println("Dynamisk tidsløsning: " + dynamicLCS(X, Y));
        System.out.println("Dynamisk brukte: " + tid + "ms\n" +
                "med stringene: " + X + " og " + Y + "\n");
    }

    public static void recursiveTimer(String X, String Y) {
        long startTime = System.currentTimeMillis();
        recusiveLCS(X, Y);
        long tid = System.currentTimeMillis() - startTime;

        String lengste = recusiveLCS(X, Y);
        int lcs = lengste.length();
        System.out.println("Rekursiv løsning: " + lcs);

        System.out.println("Rekursiv brukte: " + tid + "ms\n" +
                "med stringene: " + X + " og " + Y + "\n");
    }

    public static void timere(int length) {
        String X = generateString(length);
        String Y = generateString(length);

        dynamicTimer(X, Y);
        recursiveTimer(X, Y);

        System.out.println("Stringene har lengde: " + length);

    }

    public static void main(String[] args) {
        String stringX = "babbabab";
        String stringY = "bbabbaaab";

        String lengste = recusiveLCS(stringX, stringY);
        int lcs = lengste.length();
        System.out.println("Rekursiv løsning: " + lcs + "\n");
        System.out.println("Dynamisk løsning: " + dynamicLCS(stringX, stringY) + "\n");

        timere(15);

    }


}
