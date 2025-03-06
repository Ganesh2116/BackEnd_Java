package StringQuestions.pkg;

// Write a program to check if a string starts with a given substring.

public class Question10 {
	
	void checkSubString(String str,String cstr)
	{
		if (str.startsWith(cstr))
		{
			System.out.println("This is persent string");
		}
		else
		{
			System.out.println("This is persent string");
		}
	}
	
	public static void main(String[] args) {
		Question10 obj = new Question10();
		obj.checkSubString("ganesh bharti", "ganesh");
	}

}
