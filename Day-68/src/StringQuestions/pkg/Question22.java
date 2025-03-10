package StringQuestions.pkg;

import java.util.Arrays;

//Write a program to check if two strings are anagrams.

public class Question22 {
	
	String str = "hello";
	String str1 = "llohe";
	void anagramCheck()
	{
		if (str.length()== str1.length())
		{
			char ch[] = str.toCharArray();
			char ch1[] = str1.toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			if (Arrays.equals(ch, ch1))
			{
				System.out.println("This is anagrams");
			}
			else
			{
				System.out.println("This is not anagrams");
			}
		}
		else
		{
			System.out.println("legth are not equals and this is not anagrams");
		}
	}

	public static void main(String[] args) {
		Question22 obj = new Question22();
		obj.anagramCheck();
		
	}
}

//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Question22 
//{
//	boolean checkAnagram(String s1, String s2)
//	{
//	    if (s1.length() != s2.length())
//	    {
//	    	return false;
//	    }
//	    
//    	int[] freq = new int[256]; 
////    	System.out.println(Arrays.toString(freq));
//    	
//	    for (int i = 0; i < s1.length(); i++) {
//	        freq[s1.charAt(i)]++;  
//	        freq[s2.charAt(i)]--;  
//	    }
////	    System.out.println(Arrays.toString(freq));
//	    
//	    for (int val : freq) 
//	    {
//	    	if (val != 0)
//	    		return false;	
//	    }
//	    return true;
//	}
//	
//	boolean checkAnagram2(String s1, String s2)
//	{
//		if(s1.length() != s2.length()) {return false;}
//		
//		char[] ch1 = s1.toCharArray();
//		char[] ch2 = s2.toCharArray();
//		
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//		
//		return Arrays.equals(ch1, ch2);
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a string 1 :");
//		String s1 = sc.nextLine();	
//		System.out.println("Enter a string 2 :");
//		String s2 = sc.nextLine();	
//		
//		Question22 q22 = new Question22();
////		boolean result = q22.checkAnagram(s1,s2);
//		boolean result = q22.checkAnagram2(s1, s2);
//		if(result == true)
//			System.out.println("Strings are Anagram");
//		else
//			System.out.println("Strings are not Anagram");
//	}
//}
