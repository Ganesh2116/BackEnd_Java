package StringQuestions.pkg;

import java.util.Scanner;

// Write a program to compare two strings without using the equals() method.
public class Question20 {
	
	void compareStr(String str,String str1)
	{
		boolean be = true;
		
		if (str.length() == str1.length())
		{
			for (int i=0;i<str.length();i++)
			{
					if (str.charAt(i) != str1.charAt(i))
					{
						be = false;
					}
			}
		}
		else
		{
			System.out.println("length are not equal.");
		}
		
		if (be)
		{
			System.out.println("string are equal.");
		}
		else
		{
			System.out.println("string are not equal.");
		}
			
	}
	
	public static void main(String[] args) {
		Question20 obj = new Question20();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st string");
		String str = sc.nextLine();
		
		System.out.println("Enter 2nd string:");
		String str1 = sc.nextLine();
		
		obj.compareStr(str, str1);
		
	}
}
