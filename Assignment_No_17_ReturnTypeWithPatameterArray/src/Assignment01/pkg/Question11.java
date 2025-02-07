package Assignment01.pkg;

import java.util.Arrays;

// Q11.Wap to input an array and print its 1st  2nd and 3rd element.


public class Question11 {
	
	int[] inputArray(int arr[])
	{
		int arr1[] = new int[3];
		 for (int  i=0;i<3;i++)
		 {
			arr1[i] = arr[i]; 
		 }
		 
		 return arr1;
	}
	
	public static void main(String[] args) {
		Question11 obj = new Question11();
		int arr2[] = {1,2,3,4,5,6,7,8,9};
		int a[] = obj.inputArray(arr2);
		System.out.println("first 3 elements in array list :"+Arrays.toString(a));
		
	}
}
