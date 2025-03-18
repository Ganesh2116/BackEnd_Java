package StringQuestionReturnTypeAssignment04.pkg;

import java.util.Scanner;

// Q15.Write a Java program to remove last occurrence of a word in given string.

public class Question15 {
	
	String removeLastOccurenceWord(String str,String word)
	{
		int num = str.lastIndexOf(word);
		
		return str.substring(0,num)+str.substring(num+word.length());
	}
	
	public static void main(String[] args) {
		Question15 obj = new Question15();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		
		System.out.println("Enter the word");
		String word = sc.next();
		
		String result = obj.removeLastOccurenceWord(str, word);
		
		System.out.println(result);
	}

}
