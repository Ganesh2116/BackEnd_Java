package MissingNumber.pkg;

/*
 Q7.Given an array arr[] of size N-1 with integers in the range of [1, N], 
 the task is to find the missing number from the first N integers.

  Note: There are no duplicates in the list.

   Examples: 
   Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
   Output: 5
 */

class MissingNumber03
{
	int missingNum(int arr[])
	{
		int num = arr.length+1;
		int totalSum = num * (num+1)/2;
		
		int arrSum = 0;
		
		for (int i=0;i<arr.length;i++)
		{
			arrSum += arr[i];
		}
		
		int missing = totalSum - arrSum;
		
		return missing;
	}
}
public class Question03 {
	public static void main(String[] args) {
		int  arr[] = {1, 2, 4, 6, 3, 7, 8};
		MissingNumber03 obj = new MissingNumber03();
		int num = obj.missingNum(arr);
		
		System.err.println("Missing number is :"+num);
	}

}
