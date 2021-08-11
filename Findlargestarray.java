package week.day2.classassigments;

import java.util.Arrays;
import java.util.Iterator;

public class Findlargestarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] arrNum = { 34, 67, 89, 108, 89 };
	Arrays.sort(arrNum);	
	System.out.println("Sorted array will be" + Arrays.toString(arrNum));
System.out.println("largest number is " +arrNum[arrNum.length-1]);
	
}
}
