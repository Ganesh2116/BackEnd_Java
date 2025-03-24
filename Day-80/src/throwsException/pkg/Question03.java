package throwsException.pkg;

// Write a program that catches NumberFormatException when converting a non-numeric string into an integer.

public class Question03 {

	static public void print()
	{
		String str = "abc123";
		
		try {
			System.out.println(Integer.parseInt(str));
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		print();
	}
}
