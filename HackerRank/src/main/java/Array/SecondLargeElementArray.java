package Array;

import java.util.Arrays;

public class SecondLargeElementArray {

    public static void main(String ar[]) {
        int[] arr = new int[]{10, 21, 64, 454, 456456, 4343, 123, 3, 123, 43};

        int first = 0;
        int second = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                first = arr[i];
                second = arr[i];
                continue;
            }
            if (arr[i] > first) {
                first = arr[i];
            } else if (arr[i] < first && arr[i] > second) {
                second = arr[i];
            }

        }
        System.out.println("Second" + second);

        //2nd

        Arrays.sort(arr);
        System.out.println("Second" +arr[arr.length-2]) ;
    }
}
