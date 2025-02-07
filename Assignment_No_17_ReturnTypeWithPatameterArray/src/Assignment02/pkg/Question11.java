package Assignment02.pkg;

import java.util.Arrays;

// Q11.Wap enter an array and find the no in array  which is equal to the sum of 1st and last element.

public class Question11 {
	
	
	int[] arrayInput(int arr[])
	{
		
		int count =0;
		int sum = arr[0] +arr[arr.length-1];
		for (int i=0;i<arr.length;i++)
		{
			if (sum == arr[i])
			{
				count++;
			}
		}
		
		int arr1[] = new int[count];
		int x =0;
		for (int i=0;i<arr.length;i++)
		{
			if (sum == arr[i])
			{
				arr1[x++] = arr[i];
			}
		}
		
		return arr1;
	}
	
	public static void main(String[] args) {
		Question11 obj = new Question11();
		int arr[] = {1,2,3,10,5,6,7,8,9,10,23,3,5,9};
		int arr1[] = obj.arrayInput(arr);
		
		System.out.println("the numbers in array is :"+Arrays.toString(arr1));
		
	}

}
