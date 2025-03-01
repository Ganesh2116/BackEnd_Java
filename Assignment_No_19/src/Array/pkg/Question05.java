package Array.pkg;

import java.util.Scanner;

public class Question05 {
	void arrSum()
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
		
		System.out.println("Array sum is "+sum);
	
	}
	
	public static void main(String[] args) {
		Question05 obj = new Question05();
		obj.arrSum();
	}

}
