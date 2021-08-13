package week.day2.classassigments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		
		char t1[] = test.toCharArray();
		
		for(int i =0;i<t1.length;i++)
		{
			
		if(i%2!=0)
		{
			t1[i] = Character.toUpperCase(t1[i]);
		}
	}

System.out.println(String.valueOf(t1));
}

}