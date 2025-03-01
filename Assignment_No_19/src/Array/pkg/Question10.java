package Array.pkg;

import java.util.Scanner;

public class Question10 {
	
	void oddEleSum()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the ele");
		for (int i =0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		System.out.println("in array odd num is: ");
		for (int i =0;i<arr.length;i++)
		{
			if (arr[i]%2 != 0)
			{
				System.out.print(arr[i]+" ");
				sum+=arr[i];
			}
		}
		
		System.out.println("\nOdd ele sum is :"+sum);

	}
	
	public static void main(String[] args) {
		Question10 obj = new Question10();
		obj.oddEleSum();
	}

}
