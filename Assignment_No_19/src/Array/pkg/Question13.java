package Array.pkg;

import java.util.Scanner;

public class Question13 {
	
	void noZeroPosNeg()
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
		
		int zcount = 0;
		int pcount = 0;
		int ncount = 0;
		for (int i=0;i<arr.length;i++)
		{
			 if (arr[i]== 0)
			 {
				 zcount++;
			 }
			 else if(arr[i] >0)
			 {
				 pcount++;
			 }
			 else
			 {
				 ncount--;
			 }
		}
		
		System.out.println("Zero count is :"+zcount);
		System.out.println("Positive count is :"+pcount);
		System.out.println("Negative count is :"+ncount);
		
	}
	
	public static void main(String[] args) {
		Question13 obj = new Question13();
		obj.noZeroPosNeg();
	}

}
