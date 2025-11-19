public class kata55 {
    public static int findIt(int[] a) {
        int result = 0;
        for (int n : a) {
            result ^= n;
        }
        return result;
    }
}
