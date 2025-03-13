package ArraysQuestions.pkg;

import java.util.Arrays;

//7.Given an array A[] consisting of only 0s, 1s, and 2s. The task is to write a function that sorts the given array. 
//The functions should put all 0s first, then all 1s and all 2s in last.
//
//This problem is also the same as the famous “Dutch National Flag problem”. 
//The problem was proposed by Edsger Dijkstra. The problem is as follows:
//Given N balls of colour red, white or blue arranged in a line in random order. 
//You have to arrange all the balls such that the balls with the same colours are adjacent with the order of the balls, 
//with the order of the colours being red, white and blue (i.e., all red coloured balls come first then the white coloured
//balls and then the blue coloured balls). 
//
//Examples:
//Input: {0, 1, 2, 0, 1, 2}
//Output: {0, 0, 1, 1, 2, 2}

public class Question07 {
	
	int[] sortArr(int arr[])
	{
		Arrays.sort(arr);
		return arr;
	}
	
	public static void main(String[] args) {
		Question07 obj = new Question07();
		int arr[] = {0, 1, 2, 0, 1, 2};
		int result[] = obj.sortArr(arr);
		
		System.out.println("arrays is :"+Arrays.toString(result));
	}

}
