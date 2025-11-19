public class kata52 {
    public int solution(int number) {

        int sumaMultiplos = 0;

        for (int i = 0; i < number; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                sumaMultiplos += i;
            }
        }
        return sumaMultiplos;
    }
}
