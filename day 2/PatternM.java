public class PatternM {
    public static void main(String[] args) {
        for (int row = 0; row < 7; row++) {
            for (int col = 0; col < 5; col++) {
                if (col == 0 || col == 4 ||             
                    row == col && row <= 2 ||          
                    row + col == 4 && row <= 2) {       
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}
