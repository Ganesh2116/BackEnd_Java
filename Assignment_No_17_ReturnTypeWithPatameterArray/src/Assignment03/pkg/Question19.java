package Assignment03.pkg;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Q19.a[]={10,20,30,40,50}
   b[]={1,2,3,4,5}
 
  output array=c[]={10,5,20,4,30,3,40,2,50,1}
 */

public class Question19 {
	
	int[] mergerReversed(int arr[],int arr1[])
	{
		
		int arr3[] = new int[arr.length+arr1.length];
		int x=0;
		int y=arr1.length-1;
		
		for (int i=0;i<arr3.length;i++)
		{
			if (i%2 == 0)
			arr3[i] = arr[x++];
			
		}
		for (int i=0;i<arr3.length;i++)
		{
			if (i%2 != 0)
			arr3[i] = arr1[y--];
			
		}
		
		return arr3;
		
	}
	
	
	public static void main(String[] args) {
		Question19 obj = new Question19();
		
		int arr[] ={10,20,30,40,50};
		int arr1[] = {1,2,3,4,5};
		
		int arr3[] = obj.mergerReversed(arr,arr1);
		
		System.out.println("array is :"+Arrays.toString(arr3));
		
	}

}
