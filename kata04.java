public class kata04 {
    public static int Past(int h, int m, int s) {
        int milisegundos = (h * 3600000) + (m * 60000) + (s * 1000);
        return milisegundos;
    }
}