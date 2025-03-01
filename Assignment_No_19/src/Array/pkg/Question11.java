package Array.pkg;

import java.util.Scanner;

public class Question11 {
	
	void firstSedThirdEle()
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
		
		System.out.println("First second thrid ele : "+arr[0]+" "+arr[1]+" "+arr[2]);
		
	}
	
	public static void main(String[] args) {
		Question11 obj = new Question11();
		obj.firstSedThirdEle();
		
		

	}

}
