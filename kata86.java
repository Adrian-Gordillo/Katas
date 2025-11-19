public class kata86 {
    public static int strCount(String str, char letter) {

        int count = 0;
        if (str == "" || str == null) {
            return 0;
        }

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
