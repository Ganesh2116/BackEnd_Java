package ArraysQuestions.pkg;

import java.util.Scanner;

// Write a Java program that takes a string input and returns the number of vowels and consonants in it.


public class Question05 {
	
	void countVowelsConsonants(String str)
	{
		int vowelCount = 0;
		int consonantsCount = 0;
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if (ch == 'A'|| ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'||
				ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u')
			{
				vowelCount++;
			}
			else
			{
				consonantsCount++;
			}
		}
		
		System.out.println("Count of vowels is :"+vowelCount);
		System.out.println("Count of consonants is :"+consonantsCount);
	}
	
	public static void main(String[] args) {
		Question05 obj = new Question05();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entet the string");
		String str = sc.nextLine();
		obj.countVowelsConsonants(str);
	}

}
