package MissingNumber.pkg;
/*
 Q11.Given a sorted array of n distinct integers where each integer is in the
  range from 0 to m-1 and m > n. Find the smallest number that is missing from 
  the array. 

Examples:

Input: {0, 1, 2, 6, 9}, n = 5, m = 10 
Output: 3
 */

class MissingNumber04
{
	int number(int arr[])
	{
		int num = arr.length+1;
		int totalSum = num *(num +1)/2;
		int arrSum = 0;
		
		for (int i=0;i<arr.length;i++)
		{
			arrSum +=arr[i];
		}
		
		int number = totalSum -arrSum;
		return number;
	}
}

public class Question04 {
	public static void main(String[] args) {
		int arr[] = {0, 1, 2, 6, 9};
		MissingNumber04 obj = new MissingNumber04();
		int number = obj.number(arr);
		
		System.out.println("Missing number is: "+number);
		
	}

}
