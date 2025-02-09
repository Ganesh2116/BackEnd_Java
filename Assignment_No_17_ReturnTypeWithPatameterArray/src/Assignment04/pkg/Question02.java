package Assignment04.pkg;

import java.util.Arrays;

/*
 * 
 * Q2. Write a Java program to remove the duplicate elements of a given array and print the new length of the array.
    Sample array: [20, 20, 30, 40, 50, 50, 50]
    After removing the duplicate elements the program should return 4 as the new length of the array.
 */

public class Question02 {
	
	
	int[] dulicate(int arr[])
	{
		int count = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i] == arr[j])
				{
					arr[j] =-1;
					count++;
				}
			}
		}
		int arr1[] = new int[count];
		int x = 0;
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i] != -1)
			{
				arr1[x++] = arr[i];
				
			}
		}
		
		return arr1;
	}
	
	public static void main(String[] args) {
		Question02 obj = new Question02();
		int arr[] = {20, 20, 30, 40, 50, 50, 50};
		
		int arr1[] = obj.dulicate(arr);
		
		System.out.println("duplicate elements delete in array new array is :"+Arrays.toString(arr1));
		
	}

}
