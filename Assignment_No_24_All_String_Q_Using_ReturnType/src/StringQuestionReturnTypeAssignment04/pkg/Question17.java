package StringQuestionReturnTypeAssignment04.pkg;

import java.util.Scanner;

//Q17.Write a Java program to find total number of alphabets, digits or special character in a string.

public class Question17 {
	
	String  countOfAlphaDigitsSpecialChar(String str)
	{
		char ch[] = str.toCharArray();
		int alpha = 0;
		int digits = 0;
		int specChar = 0;
		for (int i=0;i<ch.length;i++)
		{
			if (Character.isLetter(ch[i]))
			{
				alpha++;
			}
			else if (Character.isDigit(ch[i]))
			{
				digits++;
			}
			else if(!Character.isWhitespace(ch[i]))
			{
				specChar++;
			}
		}
		
		return "Alphabets count "+alpha+" digits count "+digits+" special character count is"+specChar;
	}
	
	public static void main(String[] args) {
		Question17 obj = new Question17();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		
		String result = obj.countOfAlphaDigitsSpecialChar(str);
		
		System.out.println(result);
	}

}
