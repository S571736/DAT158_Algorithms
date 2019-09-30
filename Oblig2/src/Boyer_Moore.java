public class Boyer_Moore {

    static int NO_OF_CHARS = 256;

    public static void main(String[] args) {
        String eksempel = "aaabaadaabaaa";
        String pattern = "aabaaa";
        String eksempel2 = "Hei, dette er ein test for om min Boyer Moore algoritme fungerer eller bare gir fullstendig fjasko";
        String pattern2 = "Moore";

        int antall = Boyer_Moore(eksempel, pattern);

        System.out.println("antall sammenligninger per ord: " + (antall/eksempel.length()));
    }

    public static void badChar(String str, int size, int badchar[]) {
        int i;

        for (i = 0; i < NO_OF_CHARS; i++)
            badchar[i] = -1;

        for (i = 0; i < size; i++)
            badchar[(int) str.charAt(i)] = i;

    }

    public static int Boyer_Moore(String string, String substring) {
        int m = substring.length();
        int n = string.length();

        int badchar[] = new int[NO_OF_CHARS];

        badChar(string, m, badchar);

        int s = 0;

        while (s <= (n - m)) {
            int j = m - 1;
            while (j >= 0 && string.charAt(j) == substring.charAt(s + j)) {
                j--;

            }
            if (j < 0) {
                System.out.println("Det er mønster i bytte nr: " + s);

                s += (s + m < n) ? m - badchar[substring.charAt(s + m)] : 1;
            } else {
                s += (1 > j - badchar[substring.charAt(s + m)]) ? 1 : j - badchar[substring.charAt(s + m)];
            }
        }
        return s;
    }
}
