package String.pkg;

import java.util.Scanner;

// 5.enter a string and count the no of vowel and consonent.

public class Question05 {
	
	
	static void vowelConsonentCount()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string here:");
		String str = sc.nextLine();
		
		int cVowel = 0;
		int cCons = 0;
		
		for (int i=0;i<str.length();i++)
		{
			if( 'a' == str.charAt(i)  ||  'e' == str.charAt(i) ||  'i' == str.charAt(i) ||  'o' == str.charAt(i) ||  'u' == str.charAt(i))
			{
				cVowel++;
			}
			else if (str.charAt(i) == ' ')
			{
				continue;
			}
			else
			{
				cCons++;
			}
		}
		
		System.out.println("Vowel count is :" +cVowel);
		System.out.println("Consonent count is :" +cCons);
	}
	
	public static void main(String[] args) {
		vowelConsonentCount();
	}

}
