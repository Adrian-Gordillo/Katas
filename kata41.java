public class kata41 {
    public static double TwoDecimalPlaces(double number) {
        double moverlaComa = number * 100.0;

        long redondeado = Math.round(moverlaComa);

        double resultado = redondeado / 100.0;

        return resultado;
    }
}
