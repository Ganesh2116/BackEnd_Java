package Assignment04.pkg;

import java.util.Arrays;

// Q.6Write a Java program to separate even and odd numbers of a given array of integers. 
//Put all even numbers first, and then odd numbers

public class Question06 {
	
	int[] separate(int arr[])
	{
		
		int arr1[] = new int[arr.length];
		int x= 0;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]%2 == 0)
			{
				arr1[x++] = arr[i]; 
			}
		}
		
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]%2 != 0)
			{
				arr1[x++] = arr[i]; 
			}
		}
		
		return arr1;
	}
	
	public static void main(String[] args) {
		Question06 obj = new Question06();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int arr1[] = obj.separate(arr);
		
		System.out.println("Separate even and odd num :"+Arrays.toString(arr1));
		
	}

}
