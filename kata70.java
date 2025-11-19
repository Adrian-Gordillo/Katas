public class kata70 {
    public static int countBits(int n) {

        int contador = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                contador++;
            }
            n = n / 2;
        }

        return contador;
    }
}
