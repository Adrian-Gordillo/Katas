public class kata61 {
    static String encode(String word) {
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (word.indexOf(c) == word.lastIndexOf(c)) {
                result += "(";
            } else {
                result += ")";
            }
        }
        return result;
    }
}
