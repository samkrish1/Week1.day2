package week.day2.classassigments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="madam";
		String rev ="";
		for(int i=str.length()-1; i>= 0; i--)
		{
		 rev= rev+ str.charAt(i);
		 
		}
		if (str.equalsIgnoreCase(rev))
		{
			System.out.println("This is a palindrome");
		}
			
			else
			{
				System.out.println("This is not a palindrome");
		}
			

	}

}
