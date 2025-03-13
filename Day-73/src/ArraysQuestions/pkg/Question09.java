package ArraysQuestions.pkg;

import java.util.Arrays;

//9.An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative 
//numbers appear before all positive numbers.
//Examples : 
//Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
//Output: -12 -13 -5 -7 -3 -6 11 6 5

public class Question09 {
	
	
	int[] arragArr(int arr[])
	{
		int narr[] = new int[arr.length];
		int x = 0;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]<0)
			{
				narr[x++] = arr[i];
			}
		}
		
		
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]>0)
			{
				narr[x++] = arr[i];
			}
		}
		
		return narr;
	}
	
	public static void main(String[] args) {
		Question09 obj = new Question09();
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		
		int result[] = obj.arragArr(arr);
		
		System.out.println("rearrange array now is :"+Arrays.toString(result));
	
	}

}