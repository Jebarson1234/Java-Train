public class Question6 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 1;
        while (n>0){
            int rem  = n%10;
            sum =sum+ rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}
