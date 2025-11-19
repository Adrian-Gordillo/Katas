public class kata76 {
    public static double findUniq(double[] arr) {

        double repetido;
        if (arr[0] == arr[1] || arr[0] == arr[2]) {
            repetido = arr[0];
        } else {
            return arr[0];
        }
        for (double num : arr) {
            if (num != repetido) {
                return num;
            }
        }
        return 0;
    }
}
