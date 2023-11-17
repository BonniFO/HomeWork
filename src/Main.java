//import java.util.Random;
//import java.util.Arrays;
//public class Main {
//    public static void main(String[] args) {
//
//        Random random = new Random();
//
//        int[] arr = new int[30];
//
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(-70, 50);
//
//        }
//        int min, max = min = arr[0];
//        System.out.println(Arrays.toString(arr));
//
//        for (int i : arr) {
//            min = Math.min(min,i);
//            max = Math.max(max,i);
//       }
//
//       System.out.println("Min: " + min);
//       System.out.println("Max: " + max);
//
//    }
//}

//import java.util.Arrays;
//public class Main {
//    public static void main(String[] args) {
//        int count = 15;
//        long[] array = new long[count];
//        array[0] = 0;
//        array[1] = 1;
//
//        for (int i = 2; i < count; i++) {
//            array[i] = array[i - 1] + array[i - 2];
//            if (array[i] %2 == 0) {
//
//                System.out.println(array[i]);
//            }
//        }
//        System.out.print(Arrays.toString(array));
//    }
//}

