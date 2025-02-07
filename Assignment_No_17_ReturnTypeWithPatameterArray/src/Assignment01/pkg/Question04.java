package Assignment01.pkg;

import java.util.Scanner;

//Q4.Wap to input an array and find sum of its 1st and 2nd element.

public class Question04 {
	
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
		Question04 obj = new Question04();
		int a[] = obj.inputArray();
		
		System.out.println("sum of fist and last element is: "+(a[0]+a[1]));
	}

}
