package problems.pkg;

import java.util.Arrays;

/*
 Q8.Given three arrays sorted in non-decreasing order, print all common elements in these arrays.

Examples: 

 Input: 
ar1[] = {1, 5, 10, 20, 40, 80} 
ar2[] = {6, 7, 20, 80, 100} 
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
Output: 20, 80
 */

public class Question01 {
	
	int[] SortedDecOrder(int arr1[],int arr2[],int arr3[])
	{
		int count = 0;
	
		for (int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				for(int k=0;k<arr3.length;k++)
				{
					if (arr1[i] == arr2[j] && arr2[j] == arr3[k])
					{
						count++;
					}
				}
			}
		}
		
		
		int arr4[] = new int[count];
		int x =0;
		for (int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				for(int k=0;k<arr3.length;k++)
				{
					if (arr1[i] == arr2[j] && arr2[j] == arr3[k])
					{
						arr4[x++] = arr1[i];
					}
				}
			}
		}
		
		return arr4;
	}
	
	public static void main(String[] args) {
		int ar1[] = {1, 5, 10, 20, 40, 80};
		int ar2[] = {6, 7, 20, 80, 100};
		int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
		
		Question01 obj = new Question01();
		int arr[]= obj.SortedDecOrder(ar1, ar2, ar3);
		
		System.out.println(Arrays.toString(arr));
	}

}
