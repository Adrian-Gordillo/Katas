public class kata30 {
    public static int points(String[] games) {
        int totalPoints = 0;

        for (String game : games) {
            String[] scores = game.split(":");
            int x = Integer.parseInt(scores[0]);
            int y = Integer.parseInt(scores[1]);

            if (x > y) {
                totalPoints += 3;
            } else if (x == y) {
                totalPoints += 1;
            }
        }

        return totalPoints;
    }
}
