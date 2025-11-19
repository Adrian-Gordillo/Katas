public class kata67 {
    public static int[] squareOrSquareRoot(int[] array) {
        int[] resultado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            int sqrt = (int) Math.sqrt(num);
            if (sqrt * sqrt == num) {
                resultado[i] = sqrt;
            } else {
                resultado[i] = num * num;
            }
        }
        return resultado;
    }
}
