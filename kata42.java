public class kata42 {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {

        if (arr.length == 0) {
            return 0;
        }

        int sumArr = 0;
        for (int num : arr) {
            sumArr += num;
        }

        int sumMixedArr = 0;
        for (int num : mixedArr) {
            sumMixedArr += num;
        }

        int deleted = sumArr - sumMixedArr;

        return deleted;
    }
}
