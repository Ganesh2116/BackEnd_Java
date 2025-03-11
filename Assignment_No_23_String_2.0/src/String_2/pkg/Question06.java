package String_2.pkg;

import java.util.Scanner;

//Q6.Wap enter a string and print first non repeating character using class and object.


public class Question06 {
	
	static char firstNonrepectingChar(String str)
	{
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
			{
				return ch;
			}
			
		}
		return '\0';
	}
	
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter the String here:");
	   String str = sc.nextLine();
	   
	   char result = firstNonrepectingChar(str);
	   
	   if (result != '\0')
	   {
		   System.out.println("First Non repeating character is :"+result);
	   }
	   else
	   {
		   System.out.println("No First Non repeating character is");
	   }
	   
	  
	}
}


