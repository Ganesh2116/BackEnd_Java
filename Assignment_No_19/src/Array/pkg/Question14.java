package Array.pkg;

import java.util.Scanner;

public class Question14 {
	void firstFiveEleAvg()
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
		
		for (int i=0;i<5;i++)
		{
			 sum+=arr[i] ;
		}
		int avg = sum/5;
		
		System.out.println("first five ele avg is :"+avg);
		
	}
	
	public static void main(String[] args) {
		Question14 obj = new Question14();
		obj.firstFiveEleAvg();
	}
	
	

}
