package Assignment02.pkg;

import java.util.Arrays;

/* Q3. WAP to replace all the 0’s with 1’s in your array. Your array is [26, 0, 67, 45, 0, 78, 
54, 34, 10, 0, 34] */

public class Question03 {
	
	int[] arrayInput(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i] == 0)
				arr[i] = 1;	
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Question03 obj = new Question03();
		 int arr1[] = {26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34};
		int arr[] = obj.arrayInput(arr1);
		System.out.println(Arrays.toString(arr));
	}

}
