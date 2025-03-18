package ArraysQuestions.pkg;

import java.util.Arrays;

//10. Write a Java program to check if two given strings are anagrams of each other.  


public class Question10 {
	
	void checkAnagram(String str,String str1)
	{
		if (str.length() == str1.length())
		{
			char ch[] = str.toCharArray();
			char ch1[] = str1.toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			if (Arrays.equals(ch, ch1))
			{
				System.out.println("This is anagram.");
			}
			else
			{
				System.out.println("This is not anagram.");
			}
		}
		else
		{
			System.out.println("length are not same");
		}
	}
	

	public static void main(String[] args) {
		Question10 obj = new Question10();
		String str = "hello";
		String str1 = "elloh";
		obj.checkAnagram(str, str1);
	}

}
