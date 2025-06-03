public class Reverse {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int start = 0;
        int end = a.length - 1;
        
        // Reverse the array using two-pointer technique
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        
        // Print the reversed array
        for (int val : a) {
            System.out.print(val + " ");
        }
    }
    
}
