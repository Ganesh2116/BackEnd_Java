package Assignment01.pkg;

import java.util.Arrays;
// Q7.Wap to input an array and and print even no.

public class Question08 {
	
	int[] inputArray(int arr[])
	{
		 int count =0;
		 for (int  i=0;i<arr.length;i++)
		 {
			 if (arr[i]%2 != 0)
			 {
				count++;	
			 } 
		 }
		 
		 int arr1[] = new int[count];
		 
		 int x = 0;
		 for (int  i=0;i<arr.length;i++)
		 {
			 if (arr[i]%2 != 0)
			 {
				 arr1[x++]= arr[i];	
			 }
		 }
		 return arr1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,45,6,7,8,9,5,4,2};
		Question08 obj = new Question08();
		int arr1[] = obj.inputArray(arr);
		
		System.out.println("Array odd number is :"+Arrays.toString(arr1));
		
	}

}
