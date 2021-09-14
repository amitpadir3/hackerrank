package Searching;

public class BinarySearch {

    public static void main(String ar[]) {
        // Worst Time Complexity  > O(log n)
        // Best Time Complexity  > O(1)
        // Space Complexity O(1)

        int arr[] = new int[]{2, 3, 4, 10, 40};
        int x = 10;
        // Function call
        int result = binarySearch(arr, x);
        if (result == -1)
            System.out.print(
                    "Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + result);
    }

    private static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - 1) / 2;
            System.out.print("mid" + mid);

            if (arr[mid] == x)
                return mid;

            if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }
        return -1;
    }

}