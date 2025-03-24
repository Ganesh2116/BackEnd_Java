package throwsException.pkg;

//Write a program that throws ArithmeticException manually when a number is divided by zero.


public class Question16 {
	static public void print() throws ArithmeticException
	{
		System.out.println(5/0);
	}
	
	public static void main(String[] args) {
		try {
			print();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
