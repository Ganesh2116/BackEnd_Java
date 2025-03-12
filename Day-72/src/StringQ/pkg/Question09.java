package StringQ.pkg;

import java.util.Arrays;

//9. Write a Java program that reverses each word in an array of strings using StringBuffer and stores the results in another array.  


public class Question09 {
	
	void reversesWord(String str[])
	{
		StringBuffer reverseWords = new StringBuffer();
		String revArray[] = new String[str.length];
		for (int i=0;i<str.length;i++)
		{
			reverseWords.append(str[i]);
			reverseWords.reverse();
			revArray[i] = reverseWords.toString();
			reverseWords.delete(0, str[i].length());
		}
		
		System.out.println("reverse word arrays is :"+Arrays.toString(revArray));
	}
	
	public static void main(String[] args) {
		
		 String[] str = {"apple", "banana", "apple", "cherry", "banana", "date"};
		Question09 obj = new Question09();
		obj.reversesWord(str);
	}

}
