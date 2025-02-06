package ReturnTypeWithPatameterArray.pkg;

import java.util.Scanner;

// Q5.Wap to input an array and find sum.

public class Question05 {
	
	int inputArray()
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the array size :");
		 int size = sc.nextInt();
		 
		 int arr[] = new int[size];
		 
		 int sum =0;
		 System.out.println("Enter the array elements :");
		 
		 for (int  i=0;i<arr.length;i++)
		 {
			 
			 arr[i] = sc.nextInt();
		 }
		 
		 for (int  i=0;i<arr.length;i++)
		 {
			sum += arr[i]; 
		 }
		 
		 return sum;
	}
	
	public static void main(String[] args) {
		Question05 obj = new Question05();
		int result = obj.inputArray();
		
		System.out.println("Sum of array is "+result);
		
	}

}
