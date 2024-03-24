package algorithms;

public class SelectionSorting {

	/*
	 * selectionSoting is a Sorting Algorithm
	 * Thsi used to value are ordered
	 * The Time Complexity is O ( n 2 )
	 */

	public static void main(String[] args) {

		int[] nums = { 9, 7, 3, 1, 0, 6, 8, 2 };

		System.out.println("Selection Sorting ---> \n");
		System.out.println("before sorting : ");
		for (int num : nums) {
			System.out.print(" " + num + " ");
		}
		System.out.println();

		int[] snums = selectionSort(nums);

		System.out.println("after sorting : ");
		for (int snum : snums) {

			System.out.print(" " + snum + " ");
		}

	}

	public static int[] selectionSort(int[] nums) {

		int size = nums.length;

		for (int i = 0; i < size - 1; i++) {

			int minIndex = i;

			for (int j = i + 1; j < size; j++) {

				if (nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}

			int temp = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = temp;

		}

		return nums;
	}

}
