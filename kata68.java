public class kata68 {
    public static double[] averages(int[] numbers) {

        if (numbers == null || numbers.length < 2) {
            return new double[0];
        }
        double[] media = new double[numbers.length - 1];
        for (int i = 0; i < numbers.length - 1; i++) {

            media[i] = (numbers[i] + numbers[i + 1]) / 2.0;

        }
        return media;
    }
}
