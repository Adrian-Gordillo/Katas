public class kata56 {
    public static int digital_root(int n) {

        if (n < 10) {
            return n;
        }

        int suma = 0;
        while (n > 0) {
            suma += n % 10;
            n = n / 10;
        }

        return digital_root(suma);
    }
}
