package Sorting;

public class BubbleSort {

    public static void main(String ar[]) {
        // Worst Time Complexity  > O(n^2)
        // Best Time Complexity  > O(n)
        // Space Complexity O(1)

        int arr[] = new int[]{23, 34, 4, 10, 40};
        bubbleSort(arr);
        for (int e : arr) {
            System.out.println(e);
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean sorted;
        for (int i = 0; i < n - 1; i++) {
            sorted = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted)
                break;
        }
    }

}