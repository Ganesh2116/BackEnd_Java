package WeeklyQuestions.pkg;

import java.util.Arrays;

//Q.3.Write a Java method to find the intersection of two arrays.
//public static int[] findIntersection(int[] arr1, int[] arr2)

public class Question03 {
	
	static int[] findIntersection(int[] arr1, int[] arr2)
	{
		int size = 0;
		
		for (int i=0;i<arr1.length;i++)
		{
			for ( int j=0;j<arr2.length;j++)
			{
				 if (arr1[i] == arr2[j]) 
				 {
					 size++; 
					 break;
	             }
				
			}
		}
		
		
		int intersectionArr[] = new int[size];
		int x = 0;
		for (int i=0;i<arr1.length;i++)
		{
			for ( int j=0;j<arr2.length;j++)
			{
				 if (arr1[i] == arr2[j]) 
				 {
	                    intersectionArr[x++] = arr1[i];
	                    break;
	              }
				
			}
		}
	
		return intersectionArr;
	}

	
	
	public static void main(String[] args) {
		int arr1[] = {1,2,3};
		int arr2[] = {4,2,6};
	
		int result[] = findIntersection(arr1, arr2);
		System.out.println("Intersection array is :"+Arrays.toString(result));
	}
}
