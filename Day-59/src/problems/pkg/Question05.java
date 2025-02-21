package problems.pkg;

import java.util.Arrays;

/*
 Q13. Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order i.e. 
 fill A with first p smallest elements and fill B with remaining elements.
 Example:
 Input :
 int[] A = { 1, 5, 6, 7, 8, 10 }
 int[] B = { 2, 4, 9 }
 Output:
 Sorted Arrays:
 A: [1, 2, 4, 5, 6, 7]
 B: [8, 9, 10]
 */
public class Question05 {
	
	void sortedArray(int arr[],int arr1[])
	{
		int arr3[] = new int[arr.length+arr1.length];
		int x = 0;
		int y = 0;
		for (int i =0;i<arr.length;i++)
		{
			arr3[x++] = arr[i];
		}
		
		for (int i =0;i<arr1.length;i++)
		{
			arr3[x++] = arr1[i];
		}
		Arrays.sort(arr3);

		System.out.println("Array A is ");
		for (int i =0;i<arr.length;i++)
		{
			System.out.print(arr3[y++]+" ");
		}
		
		System.out.println("\nArray B is ");
		for (int i =0;i<arr1.length;i++)
		{
			System.out.print(arr3[y++]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		Question05 obj = new Question05();
		int arr[] = { 1, 5, 6, 7, 8, 10 };
		int arr1[] = { 2, 4, 9 };
		obj.sortedArray(arr,arr1);
	
	}

}
