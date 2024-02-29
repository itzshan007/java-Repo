package algorithms;

public class BobbleSort {

    /*
     * Bobble Soting is a Sorting Algorithm
     * Thsi used to value are ordered
     * The Time Complexity is O(n^2)
     */

    public static int[] bobbleSorting(int[] arr) {

        int size = arr.length;
        int i, j;
        for (i = 0; i < size -1; i++) {
            for (j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = { 8, 6, 90, 6, 2, 3, 7, 72, 12, 9, 61, 16, 13 };

        System.out.println("Before Sorting ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        int[] sortedArr = bobbleSorting(arr);

        System.out.println("After Sorting ");
        for (int sort : sortedArr) {
            System.out.print(sort + " ");
        }

    }
}
