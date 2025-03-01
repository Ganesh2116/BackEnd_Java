package Array.pkg;

import java.util.Scanner;

public class Question04 {
	
	void firstLastSum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of ele");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the ele here");
		for (int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("1st Ele last ele sum is : "+(arr[0]+arr[arr.length-1]));
	}
	public static void main(String[] args) {
		Question04 obj = new Question04();
		obj.firstLastSum();
	}

}
