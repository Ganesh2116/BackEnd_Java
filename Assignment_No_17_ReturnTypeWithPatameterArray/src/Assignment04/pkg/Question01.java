package Assignment04.pkg;

// Q1.Write a Java program to check if an array of integers without 0 and -1.

public class Question01 {
	
	
	boolean checkZeroOrNegOne(int  arr[])
	{
		boolean val = false;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i] == 0 || arr[i] == -1)
			{
			  val = true;
			}
		}
		
		return val;
	}
	
	public static void main(String[] args) {
		Question01 obj = new Question01();
		int arr[] = {1,2,3,4,5,6,7,8,9,-1};
		boolean str = obj.checkZeroOrNegOne(arr);
		
		System.out.println("zero and -1 are in persent in array is "+str);
	
	}

}
