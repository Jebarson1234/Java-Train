import java.util.Scanner;
public class numpattern3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int space=1;space<i;space++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}