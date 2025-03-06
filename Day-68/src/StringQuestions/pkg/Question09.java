package StringQuestions.pkg;

// Write a program to count the number of spaces in a string.

public class Question09 {
	
	void spacesCount(String str)
	{
		int spaceCount = 0 ;
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i) == ' ')
			{
				spaceCount++;
			}
		}
		
		System.out.println("space count is :"+spaceCount);
	}
	
	public static void main(String[] args) {
		Question09 obj = new Question09();
		obj.spacesCount("  ganesh   bharti ");
		
	}

}
