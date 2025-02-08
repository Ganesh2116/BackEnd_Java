package Assignment03.pkg;

import java.util.Arrays;
import java.util.Scanner;

//Q9. Wap to input an array and print it.

public class Question09 {
	
	int[] inputArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the element of array :");
		for (int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Question09 obj = new Question09();
		int arr[] = obj.inputArray();
		
		System.out.println("arrays is"+Arrays.toString(arr));
		
	}

}
