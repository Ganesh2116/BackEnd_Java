package StringQuestions.pkg;

import java.util.Scanner;

// Write a program to count the number of words in a string.

public class Question18 {
	
	void wordCount(String str)
	{
		int wCount = 0;
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i) == ' ')
			{
				wCount++;
			}
			
		}
		
		System.out.println("Word count is :"+wCount);
	}
	
	public static void main(String[] args) {
		Question18 obj = new Question18();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string :");
		String str = sc.nextLine();
		obj.wordCount(str);
	}

}
