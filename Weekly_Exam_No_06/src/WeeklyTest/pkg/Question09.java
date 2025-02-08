package WeeklyTest.pkg;

import java.util.Arrays;

/*
Q9.Write a Java program to rearrange a given array of unique elements such that every second element 
of the array is greater than its left and right elements.  

Example:
Input :
nums= { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 }
Output:
Array with every second element is greater than its left and right elements:
[1, 4, 2, 9, 3, 8, 5, 10, 7, 14, 12]
*/

public class Question09 {
	
	int[] rearrange(int a[])
	{
		for (int i=1;i<a.length-1;i=i+2)
		{
			int temp = a[i];
			a[i] = a[i+1];
			a[i+1] = temp;
		}
		return a;
	}
	
	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 };
		Question09 obj = new Question09();
		int arr[] = obj.rearrange(a);
		System.out.println("rearrange array :"+Arrays.toString(arr));

	}

}
