package String_1.pkg;

//Q20.Wap enter a string and find the count of white space.

public class Question20 {
	void countWhiteSpaces()
	{
		String str = " hello   world hellow java";
		int spaceCount = 0;
		
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i) == ' ')
			{
				spaceCount++;
			}
		}
		
		System.out.println("White space count is:"+spaceCount);
	}

	public static void main(String[] args) {
		Question20 obj = new Question20();
		obj.countWhiteSpaces();
	}
}
