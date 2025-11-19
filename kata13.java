import java.util.Random;

public class kata13 {

    public class Ghost {
        private String color;
        private static final String[] COLORS = { "white", "yellow", "purple", "red" };

        public Ghost() {
            Random rand = new Random();
            int index = rand.nextInt(COLORS.length);
            this.color = COLORS[index];
        }

        public String getColor() {
            return this.color;
        }
    }
}