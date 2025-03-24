package throwsException.pkg;

//Write a program to handle ArithmeticException using try-catch while dividing a number by zero.
public class Question01 {
	
	static public void print()
	{
		try {
			System.out.println(5/0);
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		print();
	}

}
