public class kata99 {
    public static String sumStrings(String a, String b) {

        a = a.replaceFirst("^0+(?!$)", "");
        b = b.replaceFirst("^0+(?!$)", "");

        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int suma = digA + digB + carry;

            sb.append(suma % 10);
            carry = suma / 10;

            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}