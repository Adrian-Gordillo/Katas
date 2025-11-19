public class kata34 {
    public static int twiceAsOld(int dadYears, int sonYears) {

        int Diferencia = sonYears * 2 - dadYears;

        if (Diferencia < 0) {
            return -Diferencia;
        }
        return Diferencia;
    }
}