import java.util.HashSet;
import java.util.Set;

public class kata80 {
    public class PangramChecker {
        public boolean check(String sentence) {

            sentence = sentence.toLowerCase();

            Set<Character> letras = new HashSet<>();

            for (char c : sentence.toCharArray()) {

                if (c >= 'a' && c <= 'z') {
                    letras.add(c);
                }
            }

            return letras.size() == 26;
        }
    }
}