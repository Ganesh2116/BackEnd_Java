package MissingNumber.pkg;

import java.util.Arrays;

/*
 Q11. Find the Missing Number

Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
Output: 5
Explanation: The missing number between 1 to 8 is 5
 */

class MissingNumber01
{
	int number(int arr[])
	{
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int count = 1;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i] <0)
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

public class Question01 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 6, 3, 7, 8};
		MissingNumber01 obj = new MissingNumber01();
		int count = obj.number(arr);
		
		System.out.println("Array missing number is "+count);
	}

}
