import java.lang.StringBuilder;

public class kata79 {
    class Solution {

        static String toCamelCase(String s) {
            if (s == null || s.isEmpty())
                return s;

            String[] parts = s.split("[-_]");

            StringBuilder result = new StringBuilder(parts[0]);

            for (int i = 1; i < parts.length; i++) {
                String word = parts[i];
                if (!word.isEmpty()) {

                    result.append(Character.toUpperCase(word.charAt(0)))
                            .append(word.substring(1));
                }
            }

            return result.toString();
        }
    }
}
