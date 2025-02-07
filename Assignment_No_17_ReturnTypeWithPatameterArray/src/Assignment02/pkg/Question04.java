package Assignment02.pkg;

import java.util.Arrays;
import java.util.Scanner;

//Q4.Wap enter an array and search any particular element and find the count.

public class Question04 {
	
	int  arrayInput(int arr[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Array is :"+Arrays.toString(arr));
		
		System.out.println("Enter the partcular element :");
		int num = sc.nextInt();
		int count =0;
		for (int i=0;i<arr.length;i++)
		{
			if (num == arr[i])
			{
				count++;
			}
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		Question04 obj = new Question04();
		int arr[] = {26, 1, 67, 45, 1, 78, 54, 34, 10, 1, 34};
		int count = obj.arrayInput(arr);
		System.out.println("Count of this elements is :"+count);
		
	}

}
