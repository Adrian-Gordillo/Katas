public class kata09 {
    public static int rentalCarCost(int d) {
        int total = d * 40;
        if (d >= 7) {
            total = total - 50;
        } else if (d >= 3) {
            total = total - 20;
        }
        return total;
    }
}
