package WeeklyTest.pkg;

/*
Q4.Given two unsorted arrays that represent two sets (elements in every array are distinct), 
find the union and intersection of two arrays.

Example: 

arr1[] = {7, 1, 5, 2, 3, 6} 
arr2[] = {3, 8, 6, 20, 7} 
Then your program should print Union as {1, 2, 3, 5, 6, 7, 8, 20} and Intersection as {3, 6, 7}. 
Note that the elements of union and intersection can be printed in any order.
*/
public class Question04 {
	
	
	int[] unionIntersection(int arr[],int arr1[])
	{
		int arr3[] = new int[arr.length+arr1.length];
		int x = 0;
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
				if (arr3[i]> arr3[j])
				{
					int temp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp;
				}
			}
		}
		
		return arr3;
		
	}
	
	public static void main(String[] args) {
		Question04 obj = new  Question04();
		int arr1[] = {7, 1, 5, 2, 3, 6}; 
		int arr2[] = {3, 8, 6, 20, 7};
		
		int arr3[] = obj.unionIntersection(arr1, arr2);
		
		System.out.print("intersection is: ");
		for (int i=0;i<arr3.length;i++)
		{
			for (int j=i+1;j<arr3.length;j++)
			{
				if (arr3[i] == arr3[j])
				{
					System.out.print(arr3[i]+" ");;
				}
			}
		}
		
		for (int i=0;i<arr3.length;i++)
		{
			for (int j=i+1;j<arr3.length;j++)
			{
				if (arr3[i] == arr3[j])
				{
					arr3[j] = -1;
				}
			}
		}
		System.out.print("\nUnion is:");
		for (int i=0;i<arr3.length;i++)
		{
			if (arr3[i] != -1)
			{
				System.out.print(arr3[i]+" ");
			}
		}
		
		
		
	}

}
