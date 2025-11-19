public class kata58 {
    public static int sum(int[] arr) {

        int suma = 0;
        for (int num : arr) {

            if (num > 0) {
                suma += num;
            }
        }
        return suma;
    }
}
