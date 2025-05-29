import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            for (int row = 0; row < 2 * n - 1; row++) {
                int totalStars = row < n ? 2 * row + 1 : 2 * (2 * n - row - 1) - 1;
                int spaces = row < n ? n - row - 1 : row - n + 1;
                for (int s = 0; s < spaces; s++) System.out.print(" ");
                for (int st = 0; st < totalStars; st++) System.out.print("*");
                System.out.println();
            }
        }
    }