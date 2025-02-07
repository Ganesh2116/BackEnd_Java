package Assignment03.pkg;

import java.util.Arrays;

//Q3. Wap enter an array and sort that in decending order 

public class Question03 {
	
	int[]  sortArray(int arr[])
	{
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i] <arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[] = {1,4,5,62,4,89,53,2,45,42};
		Question03 obj = new Question03();
		int arr1[] = obj.sortArray(arr);
		
		System.out.println("Sort decending order array is :"+Arrays.toString(arr1));
	}

}
