package ExceptionHandling.pkg;

import java.util.Arrays;

// Write a Java program that catches and handles a negative array size exception.
public class Question17 {
	
	
	void negtive_arrays()
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
		Question17 obj = new Question17();
		obj.negtive_arrays();
	}

}
