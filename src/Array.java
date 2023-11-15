import java.util.Random;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {

        Random random = new Random();

        int[] arr = new int[30];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-70, 50);

        }
        int min, max = min = arr[0];
        System.out.println(Arrays.toString(arr));

        for (int i : arr) {
            min = Math.min(min,i);
            max = Math.max(max,i);
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);


    }

}