package throwsException.pkg;
//Write a program that catches multiple exceptions in a single try-catch block 
//(e.g., ArithmeticException and ArrayIndexOutOfBoundsException).
public class Question09 {
	
	static public void print()
	{
		try {
			int num = 5/0;
			System.out.println(num);
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		print();
	}

}
