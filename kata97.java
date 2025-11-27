public class kata97 {
    public static int[][] matrixAddition(int[][] a, int[][] b) {
        int[][] resultado = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }
        return resultado;
    }
}
