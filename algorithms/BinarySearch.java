package algorithms;

public class BinarySearch {

    /*
     * The Data Structure Algorithms of Search
     * Binary Search ---->
     * The Time Complexite of O(log n)
     * Binary Search Faster >> Then Linear Search
     * ! importent Binary Seach have sorted array is required
     */

    public static int binarySearching(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 7, 8, 9, 10, 11 };
        int target = 8;

        int result = binarySearching(arr, target);

        if (result != -1) {
            System.out.println("The Position is : " + result);
        } else {
            System.out.println("Result Not Found !");
        }
    }
}
