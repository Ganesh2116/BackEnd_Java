package WeeklyTest.pkg;

/*
Q8.Given a sorted array with possibly duplicate elements. The task is to find indexes of first and last 
occurrences of an element X in the given array.
Note: If the element is not present in the array return {-1,-1} as pair.

Example 1:

Input:
N = 9
v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
X = 5
Output:
2 5
Explanation:
Index of first occurrence of 5 is 2
and index of last occurrence of 5 is 5.

*/
public class Question08 {
	
	void sameNumindex(int arr[])
	{
		int x = 5;
		for (int i=0;i<arr.length;i++)
		{
				if (arr[i] == x)
				{
						System.out.println("fist index is :"+i);
						break;
				}
		}
		for (int i=arr.length-1;i>=0;i--)
		{
			if (arr[i] == x)
			{
					System.out.println("last index is :"+i);
					break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Question08 obj = new Question08();
		int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
		obj.sameNumindex(arr);
		
	}

}
