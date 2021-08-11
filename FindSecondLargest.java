package week.day2.classassigments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
				// Here is the input
				int[] data = {3,2,11,4,6,7};
				Arrays.sort(data);	
				System.out.println("Sorted array will be" + Arrays.toString(data));
			System.out.println("Secound largest number is " +data[data.length-2]);

	}

}
