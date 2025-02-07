package Assignment03.pkg;

import java.util.Arrays;

// Q1. WAP to merge two Array and print the final array.

public class Question01 {
	
	int[] merageArray(int arr[],int arr1[])
	{
		int arr3[] = new int[arr.length+arr1.length];
		int x = 0;
		for (int i=0;i<arr.length;i++)
		{
			arr3[x++] = arr[i];
		}
		for (int i=0;i<arr1.length;i++)
		{
			arr3[x++] = arr1[i];
		}
		
		return arr3;
	}
	
	public static void main(String[] args) {
		Question01 obj = new Question01();
		int a[] = {1,2,3,4,5};
		int ar[] = {7,8,9,10};
		
		int arr[] = obj.merageArray(a, ar);
		
		System.out.println("merage array is :"+Arrays.toString(arr));
	}

}
