package Assignment03.pkg;

import java.util.Arrays;
import java.util.Scanner;

// Q11. WAP input 10 elements and multiply 5th elements by 25.

public class Question11 {
	
	int[] inputArray(int arr[]) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the element of array :");
		for (int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			if (i+1 == 5)
			{
				arr[i]*=25;
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Question11 obj = new Question11();
		int arr[] = new int[10];
		
		int arr1[] = obj.inputArray(arr);
		System.out.println("Now array is:"+Arrays.toString(arr1));
		
		
	}

}
