import java.util.Scanner;

public class Pattern8 {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int col = 1; col<= row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 0; row < n; row++) {
            for (int col = 1; col<=n -row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
     
        }
    }
}