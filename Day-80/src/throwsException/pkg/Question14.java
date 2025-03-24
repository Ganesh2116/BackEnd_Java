package throwsException.pkg;
//Write a program that catches an exception and prints both the exception message and stack trace.

public class Question14 {

	static public void print()
	{
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		print();
	}

}
