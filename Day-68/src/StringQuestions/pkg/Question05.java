package StringQuestions.pkg;

//Write a program to convert a string to uppercase without using the toUpperCase() method.

public class Question05 {
	
	void upperCase(String str)
	{
		String str1 = "";
		
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if (ch >= 'a' && ch <= 'z')
			{
				str1 = str1 + (char)(ch-32);
			}
		}
		
		System.out.println("Upper case string is :"+str1);
	}
	
	public static void main(String[] args) {
		Question05 obj = new Question05();
		obj.upperCase("ganesh");
	}

}
