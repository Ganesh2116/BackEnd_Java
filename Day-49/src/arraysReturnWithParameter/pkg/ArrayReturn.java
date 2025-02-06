package arraysReturnWithParameter.pkg;

import java.util.Arrays;

public class ArrayReturn {

	int [] array(int a[])
	{
		return a;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,65,67,8,9};
		
		ArrayReturn obj = new ArrayReturn();
		int b[] = obj.array(arr);
		
		// 1st way to print 
		for (int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		// 2nd way to print useing toString
		
		System.out.println(Arrays.toString(b));
		
	
	}
}
