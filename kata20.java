public class kata20 {

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {

        double maxDistance = mpg * fuelLeft;

        return distanceToPump <= maxDistance;
    }

}