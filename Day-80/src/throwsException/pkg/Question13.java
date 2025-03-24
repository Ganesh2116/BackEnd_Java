package throwsException.pkg;

// Implement a program where an exception occurs in the try block, but the finally block still executes.

public class Question13 {
	
	static public void print()
	{
		try {
			int num = 5/0;
			System.out.println(num);
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("excpeitons finally block print");
		}
	}
	
	public static void main(String[] args) {
		print();
	}

}
