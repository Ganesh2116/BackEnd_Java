package String_2.pkg;

import java.util.Arrays;
import java.util.Scanner;

// Q7.Wap enter a string and check it is anagram or not  constructor and using class and object.


public class Question07 {
	
	Question07(String str,String str1)
	{
		if (str.length() == str1.length())
		{
			char ch[] = str.toCharArray();
			char ch1[] = str1.toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			if (Arrays.equals(ch, ch1))
			{
				System.out.println("This is anagram");
			}
			else
			{
				System.out.println("This is not anagram");
			}
		}
		else
		{
			System.out.println("length are not equals.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st String :");
		String str = sc.next();
		
		System.out.println("Enter the 2st String :");
		String str1 = sc.next();
		
		Question07 obj = new Question07(str, str1);
		
		
	}

}
