package StringQuestions.pkg;

import java.util.Scanner;

// Write a program to extract a substring from a string without using the substring() method.

public class Question19 {
	
	void extractStr(String str,int sindex,int eindex)
	{
		System.out.println("substring is:");
		for (int i=sindex;i<=eindex;i++)
		{
			System.out.print(str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Question19 obj = new Question19();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		
		System.out.println("Enter the start index");
		int sindex = sc.nextInt();
		
		System.out.println("Enter the last index");
		int lindex = sc.nextInt();
		
		obj.extractStr(str, sindex, lindex);
		
	}

}
