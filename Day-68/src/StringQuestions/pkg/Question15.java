package StringQuestions.pkg;

import java.util.Scanner;

// Write a program to replace all occurrences of a character in a string with another character.

public class Question15 {
	
	void replceAllOccurrences(String str,char ch,char rch)
	{
		System.out.println("replace all char :"+str.replace(ch, rch));
	}
	
	public static void main(String[] args) {
		Question15 obj = new Question15();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		
		System.out.println("Enter replace char :");
		char ch = sc.next().charAt(0);
		
		System.out.println("Enter replace new char :");
		char rch = sc.next().charAt(0);
		
		obj.replceAllOccurrences(str, ch, rch);
	}

}
