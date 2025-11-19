public class kata81 {
    public static boolean isNarcissistic(int number) {
        String numStr = String.valueOf(number);
        int digits = numStr.length();
        int sum = 0;

        for (int i = 0; i < digits; i++) {
            int digit = numStr.charAt(i) - '0'; // Convertimos char a int
            sum += Math.pow(digit, digits);
        }

        return sum == number;
    }
}
