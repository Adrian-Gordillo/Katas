public class kata77 {
    public static String oddOrEven(int[] array) {

        int sum = 0;
        String evenOdd = "";

        for (int i = 0; i < array.length; i++) {

            sum += array[i];

            if (sum % 2 == 0) {
                evenOdd = "even";
            } else {
                evenOdd = "odd";
            }
        }
        return evenOdd;
    }
}
