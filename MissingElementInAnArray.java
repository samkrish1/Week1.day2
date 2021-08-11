package week.day2.classassigments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		System.out.println("Before sorting the array" +Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sorting the array" +Arrays.toString(arr));
		
	}
}