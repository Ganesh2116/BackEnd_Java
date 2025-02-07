package Assignment01.pkg;

import java.util.Arrays;
import java.util.Scanner;

//Q3.Wap to input an array and print its 1st and last element.

public class Question03 {
	
	int [] inputArray()
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the array size :");
		 int size = sc.nextInt();
		 
		 int arr[] = new int[size];
		 
		 int arr1[] = new int[2];
		 int x = 0;
		 System.out.println("Enter the array elements :");
		 
		 for (int  i=0;i<arr.length;i++)
		 {
			 
			 arr[i] = sc.nextInt();
		 }
		 
		 for (int  i=0;i<arr.length;i++)
		 {
			 if (i==0 || i == arr.length-1)
			 {
				 arr1[x++] = arr[i];
			 }
			 
		 }
		 
		 return arr1;
	}
	
	public static void main(String[] args) {
		Question03 obj = new Question03();
		int a[] = obj.inputArray();
		
		System.out.println("first and last elements is :"+Arrays.toString(a));
	}

}
