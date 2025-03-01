package Array.pkg;

import java.util.Scanner;

// Q3.Wap to input an array and print its 1st and last element.

public class Question03 {
	
	void firstLastEle()
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
		
		System.out.println("1st Ele "+arr[0]+" last ele " +arr[arr.length-1]);
	}
	
	public static void main(String[] args) {
		Question03 obj = new Question03();
		obj.firstLastEle();
		
	}

}
