public class ArmstrongNumber9 {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (sum == n) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
