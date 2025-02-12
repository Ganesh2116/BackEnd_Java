package MissingNumber.pkg;
import java.util.Arrays;

/*
 
Q11.Given an unsorted array arr[] with both positive and negative elements, 
the task is to find the smallest positive number missing from the array.

  Note: You can modify the original array.

  Examples:

  Input:  arr[] = {2, 3, 7, 6, 8, -1, -10, 15}
  Output: 1
 */

class MissingNumber02
{
	int missingNumber(int arr[])
	{
		Arrays.sort(arr);
		System.out.println("Now sorted array is :"+Arrays.toString(arr));
		
		int count = 1;
		
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]<0)
			{
				continue;
			}
			else if (arr[i] == count)
			{
				count++;
			}
			else
			{
				break;
			}
		}
		
		return count;
	}
}


public class Question02 {
	public static void main(String[] args) {
		int arr[] = {2, 3, 7, 6, 8, -1, -10, 15};
		MissingNumber02 obj = new MissingNumber02();
		int count = obj.missingNumber(arr);
		
		System.out.println("Missing number is :"+count);
		
		
	}

}
