package StringQuestions.pkg;

// Write a program to check if a string ends with a given substring

public class Question11 {
	
	void checkEnd(String str,String cstr)
	{
		if (str.endsWith(cstr))
		{
			System.out.println("String are end with this .");
		}
		else
		{
			System.out.println("String are not end with this .");
		}
	}
	
	public static void main(String[] args) {
		Question11 obj = new Question11();
		obj.checkEnd("hello world hello program", "gram");
		
	}

}
