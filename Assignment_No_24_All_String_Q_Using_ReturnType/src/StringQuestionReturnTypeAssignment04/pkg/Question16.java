package StringQuestionReturnTypeAssignment04.pkg;

import java.util.Scanner;

// Q16.Write a Java program to remove all occurrence of a word in given string.

public class Question16 {
	
	String removeAllOcuurenceWord(String str,String word)
	{
		
		return str.replaceAll("\\b" +word+ "\\b", "");
	}
	
	public static void main(String[] args) {
		Question16 obj = new Question16();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		
		System.out.println("Enter the word");
		String word = sc.next();
		
		String result = obj.removeAllOcuurenceWord(str, word);
		
		System.out.println("remove all occurences :"+result);
	}
}



