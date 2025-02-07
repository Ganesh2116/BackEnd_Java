package Assignment01.pkg;

import java.util.Arrays;

// Q18 Wap enter an array and print element present at even position and also find count.

public class Question18 {
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
			if ((i+1)%2 == 0)
			{
				arr1[x++] = arr[i];
			}
		}
		
		String str = "even postion count is:"+count+" persent elements is"+Arrays.toString(arr1);
		
		return str;
	}
	
	
	public static void main(String[] args) {
		Question18 obj = new  Question18();
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		String str = obj.arrayInput(arr);
		System.out.println(str);
	}


}
