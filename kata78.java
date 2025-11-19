public class kata78 {
    static int find(int[] integers) {
        int evenCount = 0;
        int oddCount = 0;
        int lastEven = 0;
        int lastOdd = 0;

        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) { // Si es par
                evenCount++;
                lastEven = integers[i];
            } else { // Si es impar
                oddCount++;
                lastOdd = integers[i];
            }
        }

        boolean lookForOdd = evenCount > oddCount;

        for (int num : integers) {
            if (lookForOdd && num % 2 != 0) {
                return num;
            } else if (!lookForOdd && num % 2 == 0) {
                return num;
            }
        }
        return 0;
    }
}
