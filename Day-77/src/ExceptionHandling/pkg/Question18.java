package ExceptionHandling.pkg;
import java.util.Arrays;

// Write a Java program that demonstrates exception handling in a constructor.

public class Question18 {
	
	Question18()
	{
		try {
			int size = -1;
			int num[] = new int[size];
			System.out.println(Arrays.toString(num));
		} 
		catch (NegativeArraySizeException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Question18 obj = new Question18();
	}

}
