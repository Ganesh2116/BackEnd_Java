package StringQuestions.pkg;

// Write a program to check if a string contains a specific character.

public class Question12 {
	
	void checkContain(String str,String str1)
	{
		if (str.contains(str1))
		{
			System.out.println("ture");
		}
		else
		{
			System.out.println("false");
		}
	}
	public static void main(String[] args) {
		Question12 obj = new Question12();
		obj.checkContain("hello world", "hello");
		
	}

}
