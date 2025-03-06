package StringQuestions.pkg;

// Write a program to find the first occurrence of a character in a string.

public class Question13 {
	
	void occurranceChar(String str,char ch)
	{
		System.out.println("occurrence of character is:"+str.indexOf(ch));
	}
	
	public static void main(String[] args) {
		Question13 obj = new Question13();
		obj.occurranceChar("this is string", 's');

	}

}
