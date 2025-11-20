import java.util.Arrays;

public class kata93 {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }
        if (a.length != b.length) {
            return false;
        }

        int[] comparacion = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            comparacion[i] = a[i] * a[i];
        }
        Arrays.sort(comparacion);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (comparacion[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
