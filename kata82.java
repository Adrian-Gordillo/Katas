public class kata82 {
    public static String chineseZodiac(int year) {

        String[] animals = new String[] { "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake",
                "Horse",
                "Goat", "Monkey", "Rooster", "Dog", "Pig" };
        String[] elements = new String[] { "Wood", "Fire", "Earth", "Metal", "Water" };

        int a = (year - 1924) % 12;

        int e = ((year - 1924) % 10) / 2;

        return elements[e] + " " + animals[a];
    }
}