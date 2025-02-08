package Assignment03.pkg;

import java.util.Arrays;

/*
 * Q20.Wap sort half array in accending and half in decending order
    input= int [] a={9,1,3,5,6,11,22,66,10,19}.
    output={1,3,5,6,9,66,22,19,11,10}
 */

public class Question20 {
	
	int[] accendingDecendingHalf(int arr[])
	{
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (i>=arr.length/2)
				{
					if(arr[i]<arr[j])
					{
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
				else 
				{
					if(arr[i]>arr[j])
					{
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
					
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Question20 obj = new Question20();
		int arr[] = {9,1,3,5,6,11,22,66,10,19};
		
		int arr1[] = obj.accendingDecendingHalf(arr);
		
		System.out.println("Output array is:"+Arrays.toString(arr1));
	}

}
