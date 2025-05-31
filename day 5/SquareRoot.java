public class SquareRoot {
    public static void main(String[] args) {
        int n = 25;
        double guess = n / 2.0;
        double epsilon = 0.00001;
        while (Math.abs(guess * guess - n) > epsilon) {
            guess = (guess + n / guess) / 2;
        }
        System.out.println(guess);
    }
}
