package Assignment03.pkg;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Q18.Wap input two array and merge in third array.
 */

public class Question18 {
	
	int[] merge(int arr[],int arr1[])
	{
		Scanner sc = new Scanner(System.in);
		int arr3[] = new int[arr.length+arr1.length];
		int x=0;
		System.out.println("Enter first element arrays :");
		for (int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter 2nd element arrays :");
		for (int i=0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
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
		Question18 obj = new Question18();
		int arr[] = new int[3];
		int arr1[] = new int[5];
		
		int arr3[] = obj.merge(arr,arr1);
		
		System.out.println("merge array is :"+Arrays.toString(arr3));
		
	}

}
