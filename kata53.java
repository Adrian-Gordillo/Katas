public class kata53 {
    public static String whoLikesIt(String... names) {

        int total = names.length;

        if (total == 0) {
            return "no one likes this";
        }

        else if (total == 1) {
            return names[0] + " likes this";
        }

        else if (total == 2) {
            return names[0] + " and " + names[1] + " like this";
        }

        else if (total == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";

        } else {

            int others = total - 2;
            return names[0] + ", " + names[1] + " and " + others + " others like this";
        }
    }
}
