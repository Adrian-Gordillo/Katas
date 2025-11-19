public class kata19 {
    public static int sortDesc(final int num) {

        String numStr = String.valueOf(num);

        char[] digits = numStr.toCharArray();

        java.util.Arrays.sort(digits);

        StringBuilder sb = new StringBuilder(new String(digits));
        sb.reverse();

        return Integer.parseInt(sb.toString());
    }
}