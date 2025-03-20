package ExceptionHandling.pkg;

// Write a Java program that catches and handles a number format exception.

public class Question04 {
	
	public static void main(String[] args) {
		
		String str = "123abc";
		
		try {
			int num = Integer.parseInt(str);
			System.out.println(num);
			
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}

}
