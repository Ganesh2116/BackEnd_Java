package StringQ.pkg;

import java.util.Scanner;

// 4. Write a Java program that finds the longest string in an array using StringBuilder and object-oriented programming principles.  

public class Question04 {
	
	void longestString(String str[])
	{ 
		StringBuffer lstr = new StringBuffer(str[0]);
		
		for (int i=0;i<str.length;i++)
		{
			if (str[i].length() > lstr.length())
			{
				lstr = new StringBuffer(str[i]);
			}
		}
		
		System.out.println("logest string is :"+lstr);
		
	}
	
	public static void main(String[] args) {
		Question04 obj = new Question04();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		
		String str[] = new String[size];
		
		System.out.println("Enter element here");
		for (int i=0;i<str.length;i++)
		{
			str[i] = sc.next();
		}
		
		obj.longestString(str);
	}

}
