package Array.pkg;

import java.util.Scanner;

public class Question15 {
	
	void evenSumCount()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the arr size :");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array ele");
		for (int i=0;i<arr.length;i++)
		{
			 arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		int count = 0;
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 == 0)
			{
				sum+=arr[i] ;
				count++;
			}
			 
		}
		System.out.println("Even number sum "+sum+" and count is :" +count);
		
	}
	public static void main(String[] args) {
		Question15 obj = new Question15();
		obj.evenSumCount();
	}

}
