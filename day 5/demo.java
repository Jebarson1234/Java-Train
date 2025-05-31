public class demo {
    public static void main(String[] args) {
        double base = 2;
        int power = -2;
        double box = 1;
        if (power < 0) {
            base = 1 / base;
            power = -power;
        }
        while (power != 0) {
            if (power % 2 != 0) {
                box = box * base;
            }
            base = base * base;
            power = power >> 1;
        }
        System.out.println(box);
    }
}
