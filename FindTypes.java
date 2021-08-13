package week.day2.classassigments;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char t2[] = test.toCharArray();

		for (int i = 0; i <= t2.length - 1; i++) {
			if (Character.isLetter(t2[i])) {
				letter++;
			} else if (Character.isDigit(t2[i])) {
				num++;
			}

			else if (Character.isSpace(t2[i])) {
				space++;
			}

			else {

				specialChar++;
			}


		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}
}
