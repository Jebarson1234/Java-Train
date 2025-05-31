public class NeonNumber {
    public static void main(String[] args) {
        int n = 9; 
        int square = n * n;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        if (sum == n) {
            System.out.println(" Neon Number");
        } else {
            System.out.println(" Not Neon Number");
        }
    }
}
