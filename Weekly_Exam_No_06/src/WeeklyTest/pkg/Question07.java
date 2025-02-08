package WeeklyTest.pkg;

import java.util.Arrays;

/*
Q7.Given an array arr[] of integers, segregate even and odd numbers in the array.
 Such that all the even numbers should be present first, and then the odd numbers.

Examples:  

Input: arr[] = 1 9 5 3 2 6 7 11
Output: 2 6 5 3 1 9 7 11

*/
public class Question07 {
	
	int[] evenOddseries(int arr[])
	{
		int x = 0;
		int arr1[] = new int[arr.length];
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]%2 ==0)
			{
				arr1[x++] = arr[i];
			}
		}
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]%2 !=0)
			{
				arr1[x++] = arr[i];
			}
		}
		return arr1;
	}
	
	public static void main(String[] args) {
		Question07 obj = new Question07();
		int arr[] = {1, 9, 5, 3, 2, 6, 7, 11};
		int arr1[] = obj.evenOddseries(arr);
		
		System.out.println("output is: "+Arrays.toString(arr1));
		
		
	}

}
