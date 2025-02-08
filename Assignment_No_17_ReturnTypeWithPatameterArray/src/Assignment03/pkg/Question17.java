package Assignment03.pkg;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Q17.Wap enter an array and print the square of the element which is present at even position.
 */
public class Question17 {
	
	int[] inputArray(int arr[]) {
		Scanner sc = new Scanner(System.in);
	
		int arr1[] = new int[arr.length];
		System.out.println("Enter the element of array :");
		
		for (int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		for (int i=0;i<arr.length;i++)
		{
			if ((i+1)%2 == 0)
			{
				arr1[i] = arr[i]*arr[i];
			}
			else
			{
				arr1[i]= arr[i];
			}
		}
		
		return arr1;
	}
	
	public static void main(String[] args) {
		Question17 obj = new Question17();
		int arr[] = new int[10];
		
		int result[] = obj.inputArray(arr);
		System.out.println("even postiont sqaure is :"+Arrays.toString(result));
		
	}

}
