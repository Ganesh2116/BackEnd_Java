package Assignment01.pkg;

import java.util.Arrays;

// Q17 Wap enter an array and print element present at odd position and also find count.

public class Question17 {
	
	String  arrayInput(int arr[])
	{
		int count = 0;
		for (int i=0;i<arr.length;i++)
		{
			if ((i+1)%2 != 0)
			{
				
				count++;
			}
		}
		int arr1[] = new int[count];
		int x =0;
		for (int i=0;i<arr.length;i++)
		{
			if ((i+1)%2 != 0)
			{
				arr1[x++] = arr[i];
			}
		}
		
		String str = "odd postion count is:"+count+" persent elements is"+Arrays.toString(arr1);
		
		return str;
	}
	
	
	public static void main(String[] args) {
		Question17 obj = new  Question17();
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		String str = obj.arrayInput(arr);
		System.out.println(str);
	}


}
