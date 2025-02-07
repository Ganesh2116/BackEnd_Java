package Assignment02.pkg;

import java.util.Arrays;

// Q10.Wap enter an array and print it in reverse order.

public class Question10 {
	
	int[] arrayInput(int arr[])
	{
		int arr1[] = new int[arr.length];
		int x =0;
		for (int i=arr.length-1;i>=0;i--)
		{
			arr1[x++] = arr[i];
		}
		return arr1;
	}
	
	public static void main(String[] args) {
		Question10 obj = new Question10();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int arr1[] = obj.arrayInput(arr);
		System.out.println("Now revesered array is :"+Arrays.toString(arr1));
		
	}

}
