public class kata95 {
    public class Multiplication {
        public static int[][] multiplicationTable(int n) {
            int[][] resultado = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    resultado[i][j] = (i + 1) * (j + 1);
                }
            }
            return resultado;
        }
    }
}
