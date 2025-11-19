public class kata72 {
    public String toJadenCase(String phrase) {

        if (phrase == null || phrase == "") {
            return null;
        }

        String[] palabras = phrase.split(" ");

        for (int i = 0; i < palabras.length; i++) {

            if (palabras[i].length() > 0) {

                palabras[i] = palabras[i].substring(0, 1).toUpperCase()

                        + palabras[i].substring(1);
            }

        }
        return String.join(" ", palabras);
    }
}
