public class kata71 {
    public static int squareSum(int[] n) {
        int suma = 0;
        for (int i = 0; i < n.length; i++) {
            suma += n[i] * n[i];
        }
        return suma;
    }
}
