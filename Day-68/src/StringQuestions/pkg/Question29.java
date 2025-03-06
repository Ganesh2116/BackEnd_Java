package StringQuestions.pkg;

//Write a program to find the frequency of a given character in a string.

public class Question29 {
	
	void frequencyChar(String str,char ch)
	{
		int freqCount = 0 ;
		
		for (int i=0;i<str.length();i++)
		{
			if (ch == str.charAt(i))
			{
				freqCount++;
			}
		}
		
		System.out.println("Frequency of char is :"+freqCount);
	}
	
	public static void main(String[] args) {
		Question29 obj = new Question29();
		obj.frequencyChar("hello java this is java program", 'a');
	}
}
