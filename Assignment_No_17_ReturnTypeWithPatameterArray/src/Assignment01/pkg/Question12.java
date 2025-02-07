package Assignment01.pkg;

import java.util.Arrays;

// Q12.Wap to input an array and find sum of its 1st and 2nd and 3rd element. 

public class Question12 {
	
	
	int inputArray(int arr[])
	{
		int sum =0;
		 for (int  i=0;i<3;i++)
		 {
			sum += arr[i]; 
		 }
		 
		 return sum;
	}
	
	public static void main(String[] args) {
		Question12 obj = new Question12();
		int arr2[] = {1,2,3,4,5,6,7,8,9};
		int a= obj.inputArray(arr2);
		System.out.println("first 3 elements in array list sum is :"+a);
		
	}

}
