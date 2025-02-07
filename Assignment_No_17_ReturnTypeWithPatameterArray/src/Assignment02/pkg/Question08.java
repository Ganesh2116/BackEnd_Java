package Assignment02.pkg;

import java.util.Arrays;

// Q8.Wap enter an array and print the  square of the element which is on even position.

public class Question08 {
	
	int[] arrayInput(int arr[])
	{
		int count = 0;
		for (int i=0;i<arr.length;i++)
		{
			if ((i+1)%2 ==0)
			{
				count++;
			}
		}
		
		int arr2[] = new int[count];
		int x = 0;
		for (int i=0;i<arr.length;i++)
		{
			if ((i+1)%2 ==0)
			{
				arr2[x++] = arr[i]*arr[i];
			}
		}
		
		return arr2;
	}
	
	public static void main(String[] args) {
		Question08 obj = new Question08();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int arr2[] = obj.arrayInput(arr);
		
		System.out.println("even positon elements square is:"+Arrays.toString(arr2));
		
	}

}
