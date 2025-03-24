package throwsException.pkg;

//Create a program that attempts to parse an invalid double value using Double.parseDouble() and handles the exception.

public class Question08 {

	static public void print()
	{
		try {
			String str = "abc123";
			System.out.println(Double.parseDouble(str));
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		print();
	}

}
