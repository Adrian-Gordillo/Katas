public class kata59 {
    public static int getCount(String str) {

        int count = 0;

        String vowels = "aeiou";

        for (int i = 0; i < str.length(); i++) {

            String letter = String.valueOf(str.charAt(i));

            if (vowels.contains(letter)) {
                count++;
            }
        }
        return count;
    }
}
