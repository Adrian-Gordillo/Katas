public class kata35 {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int catYears = 0;
        int dogYears = 0;

        if (humanYears == 1) {
            catYears = 15;
            dogYears = 15;

        } else if (humanYears == 2) {
            catYears = 15 + 9;
            dogYears = 15 + 9;

        } else {
            catYears = 15 + 9;
            dogYears = 15 + 9;

            catYears += (humanYears - 2) * 4;
            dogYears += (humanYears - 2) * 5;
        }
        return new int[] { humanYears, catYears, dogYears };
    }
}