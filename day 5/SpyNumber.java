public class SpyNumber {
    public static void main(String[] args) {
        int n = 123;  
        int sum = 0;
        int product = 1;
        int temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        if (sum == product) {
            System.out.println("Spy Number");
        } else {
            System.out.println("NOT Spy Number");
        }
    }
}
