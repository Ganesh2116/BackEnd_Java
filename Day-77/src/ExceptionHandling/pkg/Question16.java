package ExceptionHandling.pkg;

//16. Write a Java program to handle multiple exceptions in a single catch block.  


public class Question16 {
	
	void multipleException()
	{
		try 
		{
		    int[] numbers = {10, 20, 30};
		    int result = numbers[5] / 0;
		} 
		catch (ArrayIndexOutOfBoundsException e)
		{
		    System.out.println(e);
		} 
		catch (ArithmeticException e) 
		{
		    System.out.println(e);
		}

	}

	public static void main(String[] args) {
		Question16 obj = new Question16();
		obj.multipleException();
	}
}
