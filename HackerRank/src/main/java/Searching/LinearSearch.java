package Searching;

public class LinearSearch {

    public static void main(String ar[]) {
        // Worst Time Complexity  > O(n)
        // Best Time Complexity  > O(1)
        // Space Complexity O(1)

        int arr[] = new int[]{2, 3, 4, 10, 40};
        int x = 10;
        // Function call
        int result = search(arr, x);
        if (result == -1)
            System.out.print(
                    "Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + result);
    }

    private static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}