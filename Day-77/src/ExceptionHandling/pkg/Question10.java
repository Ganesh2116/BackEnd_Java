package ExceptionHandling.pkg;

//Write a Java program to catch and handle a string index out-of-bounds exception.

public class Question10 {
	
	void catch_block()
	{
		String str = "java-program";
		
		try {
			System.out.println(str.charAt(25));
		} 
		catch (IndexOutOfBoundsException e) {
			System.out.println(e);	
		}
	}
	public static void main(String[] args) {
		Question10 obj = new Question10();
		obj.catch_block();
	}

}
