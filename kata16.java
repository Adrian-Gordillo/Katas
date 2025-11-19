public class kata16 {
    public static String camelCase(String input) {
        if (input == null)
            return null;
        return input.replaceAll("([a-z])([A-Z])", "$1 $2");
    }

}