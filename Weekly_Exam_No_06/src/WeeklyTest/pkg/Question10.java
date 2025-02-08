package WeeklyTest.pkg;

import java.util.Arrays;

/*
Q10.Write a Java program to replace each element of the array with product of every other element in a given array of integers.

Example:
Input :
nums1 = { 1, 2, 3, 4, 5, 6, 7}
nums2 = {0, 1, 2, 3, 4, 5, 6, 7}
Output:
Array with product of every other element:
[5040, 2520, 1680, 1260, 1008, 840, 720]
Array with product of every other element:
[5040, 0, 0, 0, 0, 0, 0, 0]

*/
public class Question10 {
	
	
	int[] product(int nums1[])
	{
		int nums4[] = new int[nums1.length];
		
		for (int i=0;i<nums1.length;i++)
		{
			int dproduct = 1;
			for (int j=0;j<nums1.length;j++)
			{
				if (i==j)
				{
					continue;
				}
				else 
				{
					dproduct = dproduct*nums1[j];
				}
					
			}
			nums4[i] = dproduct;
		}
		
		
		return nums4;
	}
	
	
	public static void main(String[] args) {
		Question10 obj = new Question10();
		int nums1[] = {1, 2, 3, 4, 5, 6, 7};
		int result[] = obj.product(nums1);
		
		System.out.println("product array is :"+Arrays.toString(result));
		
		
	}

}
