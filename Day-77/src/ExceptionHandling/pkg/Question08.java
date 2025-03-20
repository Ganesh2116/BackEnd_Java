package ExceptionHandling.pkg;

// Write a Java program to demonstrate exception handling using a try-catch block.

public class Question08 {
	
	void try_catch_blocks()
	{
		String str = "this is execption program";
		
		try {
			System.out.println("String char :"+str.charAt(12));
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Question08 obj = new Question08();
		obj.try_catch_blocks();
	}
}
