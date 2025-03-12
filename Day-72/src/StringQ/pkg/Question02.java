package StringQ.pkg;

import java.util.Scanner;

// Implement a program that appends all elements of a string array into a single string using StringBuilder and prints the final result.

public class Question02 {
	
	void appendElementsInArray(String str[])
	{
		StringBuffer s = new StringBuffer();
		for (int i=0;i<str.length;i++)
		{
			s.append(" "+str[i]);
		}
		System.out.println("buffer String is :"+s);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		
		String str[] = new String[size];
		
		System.out.println("Enter element of array ");
		for (int i=0;i<str.length;i++)
		{
			str[i] = sc.next();
		}
		
		Question02 obj = new Question02();
		obj.appendElementsInArray(str);
		
	}

}
