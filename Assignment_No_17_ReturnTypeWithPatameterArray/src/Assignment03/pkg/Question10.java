package Assignment03.pkg;

import java.util.Arrays;
import java.util.Scanner;

//Q10. Wap intialise an array and print it.

public class Question10 {
	
	int[] arrayInput(int arr[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements :");
		for (int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
 	
	public static void main(String[] args) {
		Question10 obj = new Question10();
		int arr[] = new int[10];
		int arr1[] = obj.arrayInput(arr);
		
		System.out.println("Array is "+Arrays.toString(arr1));
		
	}

}
