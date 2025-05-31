import java.util.Scanner;
public class ArmstrongNumber9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num, sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        if (sum == original)
            System.out.println("It is an Armstrong number.");
        else
            System.out.println("It is not an Armstrong number.");
    }
}
