package WeeklyTest.pkg;

import java.util.Arrays;

/*
Q5.Given three arrays sorted in non-decreasing order, print all common elements in these arrays.

Examples: 

Input: 
ar1[] = {1, 5, 10, 20, 40, 80} 
ar2[] = {6, 7, 20, 80, 100} 
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
Output: 20, 80
*/

public class Question05 {
	
	int[] commonEle(int arr[],int arr1[],int arr2[])
	{
		int count = 0;
		int x =0;
		
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr1.length;j++)
			{
				for (int k=0;k<arr2.length;k++)
				{
					if(arr[i] == arr1[j] && arr2[k] == arr1[j] )
					{
						count++;
					}
				}
			}
		}
		int arr3[] = new int[count];
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr1.length;j++)
			{
				for (int k=0;k<arr2.length;k++)
				{
					if(arr[i] == arr1[j] && arr2[k] == arr1[j] )
					{
					arr3[x++] = arr[i];
					}
				}
			}
		}
		
		return arr3;
	}
	public static void main(String[] args) {
		Question05 obj = new Question05();
		int ar1[] = {1, 5, 10, 20, 40, 80};
		int ar2[] = {6, 7, 20, 80, 100};
		int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}; 
		
		int arr3[] = obj.commonEle(ar1, ar2, ar3);
		
		System.out.println("Common Array is: "+Arrays.toString(arr3));
		
	}

}
