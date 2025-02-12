package Shuffle.pkg;

import java.util.Arrays;
import java.util.Random;

class Array
{
	void returnArray()
	{
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(Arrays.toString(arr));
		
		Random ra = new Random();
		int num = ra.nextInt(arr.length);
		
		for (int i=0;i<arr.length;i++)
		{
			int temp = arr[i];
			arr[i] = arr[num];
			arr[num] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
public class ShuffleArray {
	public static void main(String[] args) {
		Array ar = new Array();
		ar.returnArray();
		
	}
}
