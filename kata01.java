public class kata01 {
    public static String areYouPlayingBanjo(String name) {
        if (name.startsWith("r") || name.startsWith("R")) {
            return (name + " plays banjo");
        } else {
            return (name + " does not play banjo");
        }
    }
}