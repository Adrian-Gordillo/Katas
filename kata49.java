public class kata49 {
    public static boolean getXO(String str) {

        str = str.toLowerCase();

        int x = 0;
        int o = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == 'x') {
                x++;
            }
            if (c == 'o') {
                o++;
            }
        }
        if (x == o) {
            return true;
        } else {
            return false;
        }
    }
}