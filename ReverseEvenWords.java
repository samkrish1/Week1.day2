package week.day2.classassigments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String t3[] = test.split(" ");
		for (int i = 0; i <= t3.length - 1; i++) {
			if (i % 2!=0) {
				
				for(int j = t3[i].length()-1; j>=0; j--) {
					System.out.print(t3[i].charAt(j));
				}
				
				System.out.print(" ");
			}
			else
			{
				System.out.print(t3[i] +" ");
			}
			
		}

	}

}
