package StringQuestionReturnTypeAssignment02.pkg;

import java.util.Scanner;

// Q19.Write a Java program to find first occurrence of a character in a given string.


public class Question19 {
	
	int occurrenceOfChar(String str,char ch)
	{
		int occurNum = str.indexOf(ch);
		return occurNum;
	}
	
	public static void main(String[] args) {
		Question19 obj = new Question19();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String here :");
		String str = sc.nextLine();
		
		System.out.println("Enter the check end char:");
		char ch  = sc.next().charAt(0);
		
		int result = obj.occurrenceOfChar(str, ch);
		
		System.out.println("Occurrence of char is :"+result);
	
	}

}
