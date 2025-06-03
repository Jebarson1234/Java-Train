import java.util.Scanner;

public class Checknumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        if (isPowerTow(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    public static boolean isPowerTow(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
}