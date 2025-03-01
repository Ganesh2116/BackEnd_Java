package Array.pkg;

import java.util.Arrays;
import java.util.Scanner;

//Q1.Wap to input an array and print it.

public class Question01 {
	
	void input()
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
		
		System.out.println("array is :"+Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		Question01 obj = new Question01();
		obj.input();
		
	}

}
