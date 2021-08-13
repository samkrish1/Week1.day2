package week.day2.classassigments;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "welcome to chennaie";
		char t1[] = str.toCharArray();
		 int count =0;
		
		 for(int i=0; i<=t1.length-1; i++)
		 {
		 if (t1[i] == 'e')
		 {
			 count++;
		 }

	}

	System.out.println("The count of occurance of e in string  = " +count);
}

}