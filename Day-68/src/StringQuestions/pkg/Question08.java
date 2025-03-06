package StringQuestions.pkg;

// Write a program to count the number of consonants in a string.

public class Question08 {
	
	void consonantsCount(String str)
	{
		int consonantCount = 0;
		for (int i=0;i<str.length();i++)
		{
			if ('a' != str.charAt(i) || 'e' != str.charAt(i) || 'i' != str.charAt(i) || 'o' != str.charAt(i) ||'u' != str.charAt(i) ||
				'A' != str.charAt(i) || 'E' != str.charAt(i) || 'I' != str.charAt(i) || 'O' != str.charAt(i) ||'U' != str.charAt(i))
			{
				consonantCount++;
			}
		}
		System.out.println("consonants Count is :"+consonantCount);
	}
	
	public static void main(String[] args) {
		Question08 obj = new Question08();
		obj.consonantsCount("hello world hello program");
		
	}

}
