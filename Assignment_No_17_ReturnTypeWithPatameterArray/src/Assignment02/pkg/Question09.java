package Assignment02.pkg;

import java.util.Arrays;

/*
 Q9. WAP to replace all negative value with its immediate left elements square. Means 
     arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9] 
     Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49].
 */

public class Question09 {
	
	
	int[] arrayInput(int arr[])
	{
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]<0)
			{
				arr[i] = arr[i-1]*arr[i-1];
			}
		}
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		Question09 obj = new Question09();
		int arr[] = {12, 3, -19, 29, 5, -61, 44, 7, -9};
		int arr1[] = obj.arrayInput(arr);
		
		System.out.println("Now array is :"+Arrays.toString(arr1));
	}

}
