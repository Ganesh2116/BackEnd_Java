package problems.pkg;

import java.util.Arrays;

/*
 Q10.Given the heights of N towers and a value of K, Either increase or decrease the height of every tower by K (only once) where K > 0. After modifications, 
   the task is to minimize the difference between the heights of the longest and the shortest tower and output its difference.

 Examples: 

  Input: arr[] = {1, 15, 10}, k = 6
   Output:  Minimum difference is 5.
  Explanation: Change 1 to 7, 15 to 9 and 10 to 4. Maximum difference is 5 (between 4 and 9). We can’t get a lower difference.

 */

public class Question03 {
	
	int tower(int arr[])
	{
		int k = 6;
		for (int i =0;i<arr.length;i++)
		{
			if (arr[i]>k)
			{
				int temp = arr[i]-k;
				arr[i] = temp; 
			}
			else
			{
				int temp = arr[i]+k;
				arr[i] = temp; 
			}
		}
		
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int minDiff = arr[0]-arr[arr.length-1];
		return minDiff;
	}
	
	public static void main(String[] args) {
		Question03 obj = new Question03();
		int arr[] = {1, 15, 10};
		int min = obj.tower(arr);
		
		System.out.println("Minium diffrence is "+min);
		
	}

}
