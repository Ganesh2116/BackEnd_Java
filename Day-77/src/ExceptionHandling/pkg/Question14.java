package ExceptionHandling.pkg;

//Write a Java program that uses a try-catch block inside a method.

public class Question14 {
	
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
		Question14 obj = new Question14();
		obj.catch_block();
	}

}
