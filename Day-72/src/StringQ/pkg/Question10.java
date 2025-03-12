package StringQ.pkg;

import java.util.Arrays;

// 10. Implement a program that converts all vowels in an array of strings to uppercase using StringBuilder.  


public class Question10 {
	
	void vowelsToUpperCase(String str[])
	{
		
		for (int i=0;i<str.length;i++)
		{
			StringBuffer str1 = new StringBuffer(str[i]);
			for (int j=0;j<str[i].length();j++)
			{
				char ch = str1.charAt(j);
				if ( ch == 'a'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'e')
				{
					str1.setCharAt(j, Character.toUpperCase(ch));
				}
			}
			str[i] = str1.toString();
		}
		
		System.out.println(Arrays.toString(str));
	}
	
	
	public static void main(String[] args) {
		String[] str = {"apple", "banana", "apple", "cherry", "banana", "date"};
		Question10 obj = new Question10();
		obj.vowelsToUpperCase(str);
		
	}

}
