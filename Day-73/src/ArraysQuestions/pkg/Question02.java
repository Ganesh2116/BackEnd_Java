package ArraysQuestions.pkg;

import java.util.Arrays;

//2.Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.
//
//Example 1:
//Input:
//N = 6
//A[] = {3, 2, 1, 56, 10000, 167}
//Output:
//min = 1, max =  10000

public class Question02 {
	
	String maxMinArrayEle(int a[])
	{
		Arrays.sort(a);
		
		int min = a[0];
		int max = a[a.length-1];
		
		return "Min number in arrays is:"+min+" max number in array is "+max ;
	}
	
	public static void main(String[] args) {
		Question02 obj = new Question02();
		int A[] = {3, 2, 1, 56, 10000, 167};
		String str = obj.maxMinArrayEle(A);
		
		System.out.println(str);
	}
	

}
