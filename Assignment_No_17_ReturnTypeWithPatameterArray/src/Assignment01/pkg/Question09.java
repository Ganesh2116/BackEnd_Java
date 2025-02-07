package Assignment01.pkg;

import java.util.Arrays;

// Q9.Wap to input an array and and find the sum of even no.

public class Question09 {
	
	int inputArray(int arr[])
	{
		 int sum =0;
		 for (int  i=0;i<arr.length;i++)
		 {
			 if (arr[i]%2 == 0)
			 {
				sum += arr[i];	
			 } 
		 }
		 
		 return sum;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,45,6,7,8,9,5,4,2};
		Question09 obj = new Question09();
		int result = obj.inputArray(arr);
		
		System.out.println("Array even number sum is :"+result);
		
	}

}
