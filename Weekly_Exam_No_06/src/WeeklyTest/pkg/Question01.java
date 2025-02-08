package WeeklyTest.pkg;

/*
 Q1.You are given two arrays, A and B, of equal size N. The task is to find the minimum value of
  A[0] * B[0] + A[1] * B[1] + .... + A[N-1] * B[N-1],where shuffling of elements of arrays A and B 
  is allowed.

Example 1:
Input:
N = 3 
A[] = {3, 1, 1}
B[] = {6, 5, 4}
Output:
23 
 */

public class Question01 {
	
	
	int shuffing(int arr[],int arr1[])
	{
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i=0;i<arr1.length;i++)
		{
			for (int j=i+1;j<arr1.length;j++)
			{
				if (arr1[i]>arr1[j])
				{
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		int sum = 0;
		for (int i=0;i<arr.length;i++)
		{
			sum += arr[i]*arr1[i];
		}
		
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		
		Question01 obj = new Question01();
		
		int arr1[] = {3, 1, 1};
		int arr2[] = {6, 5, 4};
		
		int arr = obj.shuffing(arr1, arr2);
		
		System.out.println("Output is :" +arr);
	}

}
