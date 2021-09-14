package Sorting;

public class SelectionSort {

    public static void main(String ar[]) {
        // Worst Time Complexity  > O(n^2)
        // Best Time Complexity  > O(n^2)
        // Space Complexity O(1)

        int arr[] = new int[]{23, 34, 4, 10, 40};
        selectionSort(arr);
        for (int e : arr) {
            System.out.println(e);
        }
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minInd = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minInd]) {
                    minInd = j;
                }
            }
            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }
    }

}