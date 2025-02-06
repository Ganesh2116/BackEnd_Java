package ReturnTypeWithPatameterArray.pkg;

import java.util.Scanner;

// Q6.Wap to input an array and find its average.

public class Question06 {
	
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
		 
		 int avg = sum/arr.length;
		 
		 return avg;
	}

		
	public static void main(String[] args) {
		Question06 obj = new Question06();
		int result = obj.inputArray();
		
		System.out.println("Avg of array is "+result);
	}
}
