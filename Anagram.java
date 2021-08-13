package week.day2.classassigments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss"; 
		
		if(text1.length() == text2.length())
		{
			char t1[] = text1.toCharArray();
			char t2[] = text2.toCharArray();
			Arrays.sort(t1);
			Arrays.sort(t2);
			
			if(Arrays.equals(t1, t2))
			{
				System.out.println("This is an anagram");
				
			}
			
			else
			{
				System.out.println("This is not an anagram");
			}
		}
		
		else
		{
			System.out.println("This is not an anagram");
		}
	}

}
