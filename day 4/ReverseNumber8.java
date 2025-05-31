public class ReverseNumber8 {
    public static void main(String[] args) {
        int n = 1234;
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        System.out.println("Reversed number: " + reverse);
    }
}
