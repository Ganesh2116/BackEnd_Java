package ExceptionHandling.pkg;
// Write a Java program to handle an arithmetic exception when dividing a number by zero

public class Question01 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(1/0);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
