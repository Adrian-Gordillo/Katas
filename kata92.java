public class kata92 {
    public static int[][] matrix(int[][] array) {
        int[][] result = new int[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                result[i][j] = array[i][j];

                if (i == j) {
                    if (result[i][j] < 0) {
                        result[i][j] = 0;
                    } else {
                        result[i][j] = 1;
                    }
                }
            }
        }
        return result;
    }
}