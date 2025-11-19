public class kata39 {
    public static int findSmallestInt(int[] args) {
        int menor = args[0];

        for (int i = 1; i < args.length; i++) {

            if (args[i] < menor) {
                menor = args[i];
            }
        }
        return menor;
    }
}