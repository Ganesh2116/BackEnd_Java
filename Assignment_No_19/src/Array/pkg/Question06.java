package Array.pkg;

import java.util.Scanner;

public class Question06 {
	void arrAvg()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of ele");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the ele");
		for (int i=0 ;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		
		for (int i=0;i<arr.length;i++)
		{
			sum +=arr[i];
		}
		int avg = sum/arr.length;
		System.out.println("Array avg is "+avg);
	
	}

	public static void main(String[] args) {
		Question06 obj = new Question06();
		obj.arrAvg();
		
	}
}
