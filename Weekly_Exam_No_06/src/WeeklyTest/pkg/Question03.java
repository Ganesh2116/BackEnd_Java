package WeeklyTest.pkg;

import java.util.Arrays;

/*
 Q3.Given an array of size N filled with numbers from 1 to N-1 in random order. 
 The array has only one repetitive element. The task is to find the repetitive element.

Examples:

Input: a[] = {1, 3, 2, 3, 4}
Output: 3
 */
public class Question03 {
	
	int[] repetitive(int arr[])
	{
	
		int x =0;
		int count = 0;
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i] == arr[j])
				{
					count++;
				}
			}
		}
		int arr1[] = new int[count];
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i] == arr[j])
				{
					arr1[x++] = arr[i];
				}
			}
		}
		
		return arr1;
	}
	
	public static void main(String[] args) {
		Question03 obj = new Question03();
		int arr[] =  {1, 3, 2, 3, 4};
		int arr1[] = obj.repetitive(arr);
		
		System.out.println("output is :"+Arrays.toString(arr1));
		

		
	}

}
