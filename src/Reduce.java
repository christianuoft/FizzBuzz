public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int number = 100;
        while (number != 0) {
            if (number % 2 == 0) {
                number /= 2;
            }
            else {
                number -= 1;
            }
            steps += 1;
        }
        System.out.println(steps);
    }
}
