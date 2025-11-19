public class kata73 {
    public static int persistence(long n) {

        int contador = 0;

        while (n >= 10) {

            String numeroString = Long.toString(n);

            long multiplicar = 1;

            for (int i = 0; i < numeroString.length(); i++) {
                char dividido = numeroString.charAt(i);
                int charInt = Character.getNumericValue(dividido);
                multiplicar *= charInt;
            }

            n = multiplicar;

            contador++;
        }

        return contador;
    }
}
