package StringQuestions.pkg;

// Write a program to count the number of vowels in a string.

public class Question07 {
	
	void vowelsCount(String str)
	{
		int vowelCount = 0;
		for (int i=0;i<str.length();i++)
		{
			if ('a' == str.charAt(i) || 'e' == str.charAt(i) || 'i' == str.charAt(i) || 'o' == str.charAt(i) ||'u' == str.charAt(i)
				|| 'A' == str.charAt(i) || 'E' == str.charAt(i) || 'I' == str.charAt(i) || 'O' == str.charAt(i) ||'U' == str.charAt(i))
			{
				vowelCount++;
			}
		}
		System.out.println("vowel Count is :"+vowelCount);
	}

	public static void main(String[] args) {
		Question07 obj = new Question07();
		obj.vowelsCount("hello world");
	}
}
