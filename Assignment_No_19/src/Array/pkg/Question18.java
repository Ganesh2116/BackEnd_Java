package Array.pkg;

import java.util.Scanner;

public class Question18 {
	
	void evenPosCount()
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
		
		int count = 0;
		System.out.println("Even positions ele :");
		for (int i=0;i<arr.length;i++)
		{
			if(i%2 != 0)
			{
				System.out.println(arr[i]);
				count++;
			}
			 
		}
		System.out.println("Even count is :" +count);
		
	}
	
	public static void main(String[] args) {
		Question18 obj = new Question18();
		obj.evenPosCount();
	}

}
