public class Boyer_Moore {

    public static void main(String[] args) {
        String eksempel = "Hei, dette er ein test for om min Boyer Moore algoritme fungerer eller bare gir fullstendig fjasko";
        String pattern = "Moore";

        Boyer_Moore(eksempel, pattern);
    }

    public static String Boyer_Moore(String string, String substring) {
        int indexString = substring.length() - 1;
        int indexSubstring = substring.length() - 1;

        do {
            System.out.println(string.charAt(indexString));
            if (string.charAt(indexString) == substring.charAt(indexSubstring)) {
                if (indexSubstring == 0) {
                    return "There's a pattern ending in " + indexString;
                } else {
                    indexString--;
                    indexSubstring--;
                }
            } else {
                indexString = indexString + substring.length() - Math.min(indexSubstring, 1 + string.lastIndexOf(string.charAt(indexString)));
                //Her er det noe feil, FIX IT
                indexSubstring = substring.length() - 1;
            }
        } while (indexString < string.length() - 1);

        return "There is no substring of T matching P";
    }

    public static int last(char c, String substring) {
        int i = substring.length();
        while (i >= 0) {
            if (c == substring.charAt(i)) {
                return i;
            }
            i--;
        }
        return -1;
    }
}
