package ArraysQuestions.pkg;



//6.Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[].
//  Expected time complexity is O(Logn) 
//  Examples: 
//  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
//  Output: 4 // x (or 2) occurs 4 times in arr[]

public class Question06 {
	
	int countOccurrencesX(int x,int arr[])
	{
		int count = 0;
		for (int i=0;i<arr.length;i++)
		{
			if (x == arr[i])
			{
				count++;
			}
		}
		
		return count;
	}
	
	
	
	public static void main(String[] args) {
		Question06 obj = new Question06();
		
		int arr[] = {1, 1, 2, 2, 2, 2, 3,};
		int x = 2;
		
		int result = obj.countOccurrencesX(x, arr);
		
		System.out.println("ocuurence of x is :"+result);
		
		
	}

}
