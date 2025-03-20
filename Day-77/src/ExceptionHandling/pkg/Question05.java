package ExceptionHandling.pkg;

// Write a Java program to handle multiple exceptions using multiple catch blocks

public class Question05 {
	public static void main(String[] args) {
		
		try {
			System.out.println(5/0);
		}
		catch (NumberFormatException e) {
			System.out.println(e);
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
