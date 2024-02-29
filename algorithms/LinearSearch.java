package algorithms;

public class LinearSearch {

    /*
     * The Data Structure algorithms of Search
     * Linear Search ----> 
     * This is Time Complexite is O(n)
     */

    public static int linearSearching(int[] arr, int target) {
        int size = arr.length;
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 6, 7, 8, 9, 0, 12, 32 };
        int target = 0;

        int result = linearSearching(arr, target);

        if (result != -1)
            System.out.println("Find The Target Value Position is : " + result);
        else
            System.out.println("Value Not Found ");
    }
}
