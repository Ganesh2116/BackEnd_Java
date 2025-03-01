package Array.pkg;

import java.util.Scanner;

public class Question17 {
	
	void oddPosCount()
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
		System.out.println("Odd positions ele :");
		for (int i=0;i<arr.length;i++)
		{
			if(i%2 == 0)
			{
				System.out.println(arr[i]);
				count++;
			}
			 
		}
		System.out.println("odd count is :" +count);
		
	}
	
	public static void main(String[] args) {
		Question17 obj = new Question17();
		obj.oddPosCount();
	}

}
