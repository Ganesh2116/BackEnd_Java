package throwsException.pkg;

//Create a program that handles an exception inside a nested try-catch block.

public class Question10 {
	
	static public void print()
	{
		try {
			
			try {
				String str = "java";
				System.out.println(str.charAt(5));
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
			System.out.println(5/0);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		print();
	}

}
