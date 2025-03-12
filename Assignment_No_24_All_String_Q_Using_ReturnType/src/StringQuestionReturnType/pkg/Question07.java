package StringQuestionReturnType.pkg;

import java.util.Scanner;

// 7.Write a Java program to compare two strings using equalignore case.

public class Question07 {
	
	String compareString(String str,String str1)
	{
		 if (str.equalsIgnoreCase(str1)) 
		 {
	            return "The strings are equal ignoring case";
	     } else 
	     {
	            return "The strings are not equal.";
	     }
		
		
	}
	
	public static void main(String[] args) {
		Question07 obj = new Question07();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st String :");
		String str = sc.nextLine();
		
		System.out.println("Enter the 2nd String :");
		String str1 = sc.nextLine();
		
		String result = obj.compareString(str, str1);
		System.out.println(result);
	}

}
