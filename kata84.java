public class kata84 {
    public int cockroachSpeed(double x) {
        double speed = (x * 100000) / 3600;
        int resultado = (int) Math.floor(speed);
        return resultado;
    }
}
