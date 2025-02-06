package ReturnTypeWithPatameterArray.pkg;

import java.util.Arrays;

// Q2.Wap intialise an array and print it.

public class Question02 {
	
	int [] array(int arr[])
	{
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,98,7,5};
		Question02 obj = new Question02();
		int arr2[] = obj.array(arr);
		
		System.out.println(Arrays.toString(arr2));
	}

}
