package ArraysQuestions.pkg;

import java.util.Arrays;

//3.Given an array (or string), the task is to reverse the array/string.
//Examples : 
//Input  : arr[] = {1, 2, 3}
//Output : arr[] = {3, 2, 1}

public class Question03 {
	
	int[] reverse(int arr[])
	{
		int n =0;
		int rarr[] = new int[arr.length];
		for (int i=arr.length-1;i>=0;i--)
		{
			rarr[n++] = arr[i];
		}
		
		return rarr;
	}
	
	public static void main(String[] args) {
		Question03 obj = new Question03();
		int arr[] = {1, 2, 3};
		int rarr[] =obj.reverse(arr);
		
		System.out.println(Arrays.toString(rarr));
		
	}

}
