package ArraysQuestions.pkg;

import java.util.Arrays;

// 4.Given an array arr[] of size N, the task is to sort this array in ascending order in C.
//Examples: 
//Input: arr[] = {0, 23, 14, 12, 9}
//Output: {0, 9, 12, 14, 23}

public class Question04 {
	
	int[] sortArr(int arr[])
	{
		Arrays.sort(arr);
		return arr;
	}
	
	public static void main(String[] args) {
		
		Question04 obj= new Question04();
		int arr[] = {0, 23, 14, 12, 9};
		int sarr[] = obj.sortArr(arr);
		
		System.out.println("Sort arrays is:"+Arrays.toString(sarr));
		
	}

}
