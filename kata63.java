public class kata63 {
    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.length() >= 5) {

                String reversed = new StringBuilder(word).reverse().toString();
                result.append(reversed);
            } else {

                result.append(word);
            }

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
