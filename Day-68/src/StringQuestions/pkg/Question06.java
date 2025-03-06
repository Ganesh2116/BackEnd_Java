package StringQuestions.pkg;

// Write a program to convert a string to lowercase without using the toLowerCase() method.

public class Question06 {
	
	void lowerCase(String str)
	{
		String str1 = "";
		
		// a = 97 A = 65
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
			{
				str1 = str1 + (char)(ch+32);
			}
		}
		
		System.out.println("lower case String is :"+str1);
	}
	

	public static void main(String[] args) {
		Question06 obj = new Question06();
		obj.lowerCase("GANESH");
		
	}
}
