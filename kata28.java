public class kata28 {
    public static int greedy(int[] dice) {

        int[] counts = new int[7];

        for (int die : dice) {
            counts[die]++;
        }

        int score = 0;

        for (int i = 1; i <= 6; i++) {
            if (counts[i] >= 3) {
                if (i == 1) {
                    score += 1000;
                } else {
                    score += i * 100;
                }
                counts[i] -= 3;
            }
        }

        score += counts[1] * 100;
        score += counts[5] * 50;

        return score;
    }
}
