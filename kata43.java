public class kata43 {
    public static int minimumNumber(int[] numbers) {

        int sumArray = 0;

        for (int number : numbers) {
            sumArray += number;
        }

        int toAdd = 0;

        while (true) {
            int n = sumArray + toAdd;
            boolean esPrimo = true;
            if (n < 2) {
                esPrimo = false;
            } else {
                for (int i = 2; i * i <= n; i++) {
                    if (n % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            if (esPrimo) {
                break;
            } else {
                toAdd++;
            }
        }
        return toAdd;
    }
}
