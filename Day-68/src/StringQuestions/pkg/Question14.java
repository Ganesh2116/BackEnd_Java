package StringQuestions.pkg;

import java.util.Scanner;

// Write a program to find the last occurrence of a character in a string.

public class Question14 {
	
	void lastOccurrence(String str,char ch)
	{
		System.out.println("last occurrence of char :"+str.lastIndexOf(ch));
	}
	
	public static void main(String[] args) {
		Question14 obj = new Question14();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String here :");
		String str = sc.nextLine();
		
		System.out.println("Enter the char");
		char ch = sc.next().charAt(0);
		obj.lastOccurrence(str, ch);
	}

}
