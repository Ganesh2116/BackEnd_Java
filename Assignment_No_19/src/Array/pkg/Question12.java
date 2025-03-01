package Array.pkg;

import java.util.Scanner;

public class Question12 {
	
	void firstSedThirdEleSum()
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
		
		System.out.println("First second thrid ele sum: "+(arr[0]+arr[1]+arr[2]));
		
	}
	
	public static void main(String[] args) {
		Question12 obj = new Question12();
		obj.firstSedThirdEleSum();
	}

}
