public class kata101 {
    public static long[] productFib(long prod) {
        long f0 = 0;
        long f1 = 1;

        while (f0 * f1 < prod) {
            long next = f0 + f1;
            f0 = f1;
            f1 = next;
        }

        return new long[] { f0, f1, (f0 * f1 == prod) ? 1 : 0 };
    }
}
