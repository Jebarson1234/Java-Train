public class PatternK {
    public static void main(String[] args) {
        for (int row = 0; row < 7; row++) {
            for (int col = 0; col < 5; col++) {
                if (col == 0 ||                         
                    col == row - 1 && row >= 1 && row <= 3 ||   // upper diagonal
                    col == 5 - row - 1 && row >= 3 && row <= 5) { // lower diagonal
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // next line
        }
    }
}
