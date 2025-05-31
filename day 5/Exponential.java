public class Exponential {
    public static void main(String[] args) {
        double base = 2;
        int power = 3;
        double result = 1;
        int exp = power;
        if (power < 0) {
            base = 1 / base;
            exp = -power;
        }
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println(result);
    }
}
