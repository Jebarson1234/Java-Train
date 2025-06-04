import java.util.Arrays;
public class frequency {
    static void FindFrequencyOfArray(int[] arr){
        int len = arr.length, count;
        Arrays.sort(arr);
        int max = 1, min = 1, high = arr[len - 1] + 1;
        int[] res = new int[high];

        for(int i = 0; i < len; i++){
            res[arr[i]]++;
        }
        for(int i = 0; i < high; i++){
            if(res[i] < min && res[i] > 0){
                min = res[i];
            } else if(res[i] > max){
                max = res[i];
            }
            System.out.println(i + " -> " + res[i]);
        }
        System.out.println(max + " " + min);
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5, 1, 2, 3, 4};
        FindFrequencyOfArray(arr);
    }
}
