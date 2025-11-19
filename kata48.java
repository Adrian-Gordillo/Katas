public class kata48 {
    public static int duplicateCount(String text) {

        text = text.toLowerCase();

        int sumDuplicate = 0;

        String revisado = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (revisado.indexOf(c) != -1) {
                continue;
            }
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == c) {
                    count++;
                }
            }
            if (count > 1) {
                sumDuplicate++;
            }
            revisado += c;
        }
        return sumDuplicate;
    }
}