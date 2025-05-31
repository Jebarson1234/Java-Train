public class PrimeCheck11 {
    public static void main(String[] args) {
        int n = 7;
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.print("Numbers from 1 to 10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}
