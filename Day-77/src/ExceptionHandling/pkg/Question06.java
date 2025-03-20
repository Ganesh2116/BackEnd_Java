package ExceptionHandling.pkg;

// Write a Java program that demonstrates the use of a finally block.

public class Question06 {
	
	public static void main(String[] args) {
		
		String str = "exceptions finally block use";
		
		try {
			System.out.println(str);
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("this is finally block");
		}
		
	}

}
