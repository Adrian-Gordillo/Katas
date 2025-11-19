public class kata74 {
    public static int grow(int[] x) {

        int multiplicar = 1;

        for (int i = 0; i < x.length; i++) {
            multiplicar *= x[i];
        }

        return multiplicar;
    }
}
