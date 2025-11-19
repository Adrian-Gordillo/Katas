public class kata40 {
    public static String remove(String word) {
        int longitud = word.length();

        if (longitud <= 2) {
            return "";
        } else {
            return word.substring(1, longitud - 1);
        }
    }
}
