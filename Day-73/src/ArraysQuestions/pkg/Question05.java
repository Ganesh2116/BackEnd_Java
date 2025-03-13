package ArraysQuestions.pkg;

import java.util.Arrays;

//5.Given an array and a number K where K is smaller than the size of the array. Find the K’th smallest element in the given array. 
//Given that all array elements are distinct.
//Examples:  
//Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
//Output: 7

public class Question05 {
	
	int thirdSmallestEle(int arr[],int k)
	{
		Arrays.sort(arr);
		
		return arr[k-1];
	}
	
	public static void main(String[] args) {
		Question05 obj = new Question05();
		int arr[] = {7, 10, 4, 3, 20, 15};
		int k = 3;
		
		int result = obj.thirdSmallestEle(arr, k);
		System.out.println("Third smellest element is :"+result);
		
		
	}

}
