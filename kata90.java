import java.util.Arrays;

public class kata90 {
    public static int[] sortArray(int[] array) {
        int[] impares = Arrays.stream(array)
                .filter(n -> n % 2 != 0)
                .sorted()
                .toArray();

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = impares[index++];
            }
        }
        return array;
    }
}
