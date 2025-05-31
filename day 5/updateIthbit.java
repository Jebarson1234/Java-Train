public class updateIthbit{
    public static void main(String[] args) {
        int n=15;
        pos=2;
        n=clearIthBit(n,pos);
        int mask=1<<pos;
        n=n/mask;
        System.out.println(n);
    }
    public static int clearIthBit(int n,int pos){
        int mask=~(-1<<pos);
        n=n&mask;
        return n;
    }
}