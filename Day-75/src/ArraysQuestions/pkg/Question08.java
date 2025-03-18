package ArraysQuestions.pkg;

import java.util.Arrays;

// Write a Java program that takes an array of integers and prints the second largest number in the array.

public class Question08 {
	
	void secondLargestNum(int arr[])
	{
		Arrays.sort(arr);
		System.out.println("Second largest Number is:"+arr[arr.length-2]);
	}
	
	public static void main(String[] args) {
		Question08 obj = new Question08();
		int arr[] = {1,2,3,4,5,6,85};
		obj.secondLargestNum(arr);
	}

}
