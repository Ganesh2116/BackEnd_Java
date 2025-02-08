package WeeklyTest.pkg;

/*
 Q2.Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K.
  The task is to find the element that would be at the k’th position of the final sorted array.
 

Example 1:

Input:
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
Output:
6
 */

public class Question02 {
	
	int merageSort(int arr[],int arr1[])
	{
		int arr3[] = new int[arr.length+arr1.length];
		int x = 0;
		int k = 5;
		int output = 0;
		
		for (int i=0;i<arr.length;i++)
		{
			arr3[x++] = arr[i];
		}
		
		for (int i=0;i<arr1.length;i++)
		{
			arr3[x++] = arr1[i];
		}
		
		for (int i=0;i<arr3.length;i++)
		{
			for (int j=i+1;j<arr3.length;j++)
			{
				if (arr3[i]<arr3[j])
				{
					int temp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp;
				}
			}
		}
		
		for (int i=0;i<arr3.length;i++)
		{
			if (k == i+1)
			{
				output = arr3[i];
			}
		}
		
		return output;
		
	}
	
	public static void main(String[] args) {
		Question02 obj = new Question02();
		int arr1[] = {2, 3, 6, 7, 9};
		int arr2[] = {1, 4, 8, 10};
		int output = obj.merageSort(arr1, arr2);
		
		System.out.println("Output is "+output);
		
	}

}
