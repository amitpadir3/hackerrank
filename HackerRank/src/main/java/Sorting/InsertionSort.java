package Sorting;

public class InsertionSort {

    public static void main(String ar[]) {
        // Worst Time Complexity  > O(n^2)
        // Best Time Complexity  > O(n)
        // Space Complexity O(1)

        int arr[] = new int[]{23, 34, 4, 10, 40};
        insertionSort(arr);
        for (int e : arr) {
            System.out.println(e);
        }
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

    }

}