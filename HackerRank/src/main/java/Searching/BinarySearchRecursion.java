package Searching;

public class BinarySearchRecursion {

    public static void main(String ar[]) {
        // Worst Time Complexity  > O(n)
        // Best Time Complexity  > O(1)
        // Space Complexity O(1)

        int arr[] = new int[]{2, 3, 4, 10, 40};
        int x = 10;
        // Function call
        int result = binarySearch(arr, 0, arr.length - 1, x);
        if (result == -1)
            System.out.print(
                    "Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + result);
    }

    private static int binarySearch(int[] arr, int l, int r, int x) {

        {
            if (l <= r) {
                int mid = l + (r - l) / 2;

                // If the element is present at the
                // middle itself
                if (arr[mid] == x)
                    return mid;

                // If element is smaller than mid, then
                // it can only be present in left subarray
                if (arr[mid] > x)
                    return binarySearch(arr, l, mid - 1, x);

                // Else the element can only be present
                // in right subarray
                return binarySearch(arr, mid + 1, r, x);
            }

            // We reach here when element is not present
            // in array
            return -1;
        }

    }
}