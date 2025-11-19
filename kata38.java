public class kata38 {
    public static String getMiddle(String word) {

        int longitud = word.length();
        int posCentro = longitud / 2;

        if (longitud % 2 == 0) {
            return word.substring(posCentro - 1, posCentro + 1);
        } else {
            return word.substring(posCentro, posCentro + 1);
        }
    }
}
