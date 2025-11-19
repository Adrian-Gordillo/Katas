public class kata66 {
    public static int repeats(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                sum += arr[i];
            }
        }

        return sum;
    }
}
