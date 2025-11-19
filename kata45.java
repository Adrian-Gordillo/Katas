public class kata45 {
    public static String fakeBin(String numberString) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberString.length(); i++) {
            char c = numberString.charAt(i);

            int digit = Character.getNumericValue(c);

            if (digit < 5) {
                result.append('0');
            } else {
                result.append('1');
            }
        }
        return result.toString();
    }
}
