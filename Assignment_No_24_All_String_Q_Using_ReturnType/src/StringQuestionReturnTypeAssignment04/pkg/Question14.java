package StringQuestionReturnTypeAssignment04.pkg;

import java.util.Scanner;

// Q14.Write a Java program to remove first occurrence of a word from string.

public class Question14 {
	
	void  removeFirstOccurrence(String str,String word)
	{
		int num = str.indexOf(word);
		System.out.println(str.substring(0,num)+str.substring(num+word.length()));
	}
	
	public static void main(String[] args) {
		Question14 obj = new Question14();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		
		System.out.println("Enter the word");
		String word = sc.next();
		
		obj.removeFirstOccurrence(str, word);
	}
}
