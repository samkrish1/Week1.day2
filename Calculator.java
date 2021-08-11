package week.day2.classassigments;

public class Calculator {

public static void sum(int num1 , int num2 , int num3) {
	int sum =num1+num2+num3;	
	System.out.println("Sum of numbers:" + sum );
}

public static void subtraction(int num1 , int num2) {
	int sub =num1-num2;	
	System.out.println("Subration of numbers:" + sub );
}

public static void multiplication(double num1 , double num2) {
	double mul =num1*num2;	
	System.out.println("Multiplication of numbers:" + mul );
}

public static void divion(float num1 , float num2) {
	float div =num1/num2;	
	System.out.println("Multiplication of numbers:" + div );
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Calculator obj1 = new Calculator();
obj1.sum(4, 7, 9);
obj1.subtraction(90, 10);
obj1.multiplication(78d, 89d);
obj1.divion(0.8f, 7.9f);

	}

}
