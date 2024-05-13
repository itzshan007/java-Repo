package algorithms;

public class InsertionSorting {

	public static void main(String[] args) {

		int[] arr = {9,7,6,11,0,3,2,8,10,13,1};
		
		int[] result = insrtionSorting(arr);

		System.out.println("Befour Sorting");
		for(int a : arr) {
			System.out.print(a+" ");
		}
		
		
		System.out.println("After Sorting ");
		System.out.println();
		for(int res:result) {
			System.out.print(res + " ");
		}
	}

	public static int[] insrtionSorting(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			
			
		}
		
		
		return arr;
	}

}
