public class kata75 {
    public static int liters(double time) {

        double litroxHora = time * 0.5;
        int resultado = (int) Math.floor(litroxHora);
        return resultado;
    }
}
