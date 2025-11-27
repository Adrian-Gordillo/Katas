import java.util.List;

public class kata96 {
    public static int countSmileys(List<String> arr) {
        int count = 0;

        for (int i = 0; i < arr.size(); i++) {
            String s = arr.get(i);

            if (s.length() < 2 || s.length() > 3)
                continue;

            if (!":;".contains(s.charAt(0) + ""))
                continue;

            if (!")D".contains(s.charAt(s.length() - 1) + ""))
                continue;

            if (s.length() == 3 && !"~-".contains(s.charAt(1) + ""))
                continue;

            count++;
        }

        return count;
    }
}