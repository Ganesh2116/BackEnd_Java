package Assignment01.pkg;

import java.util.Arrays;
import java.util.Scanner;

// Q1.Wap to input an array and print it.

public class Question01 {
	
	int [] inputArray()
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the array size :");
		 int size = sc.nextInt();
		 
		 int arr[] = new int[size];
		 
		 System.out.println("Enter the array elements :");
		 
		 for (int  i=0;i<arr.length;i++)
		 {
			 arr[i] = sc.nextInt();
		 }
		 
		 return arr;
	}
	
	int [] returnArray(int a[])
	{
		 
		 return a;
	}

	public static void main(String[] args) {
		Question01 obj = new Question01();
		int a[] = obj.inputArray();
		int k[] = obj.returnArray(a);
		
		System.out.println(Arrays.toString(k));
		
	}
	
}
