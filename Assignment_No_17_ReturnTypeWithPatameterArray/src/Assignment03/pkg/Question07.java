package Assignment03.pkg;

import java.util.Arrays;

// Q7. WAP Input 10 elements in float and print it;

public class Question07 {
	
	void printNum(float arr[])
	{
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		Question07 obj = new  Question07();
		float arr[] = {1,2,3,4,5,6,7,8,9,10};
		obj.printNum(arr);
	}

}
