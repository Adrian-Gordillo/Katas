public class kata44 {
    public static double sum(double[] numbers) {

        if (numbers.length == 0) {
            return 0;
        }

        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
}
