package StringQuestions.pkg;

// Write a program to remove all spaces from a string.

public class Question16 {
	
	void spaceRemove(String str)
	{
		String nstr = "";
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i)== ' ')
			{
				continue;
			}
			else	
			{
				nstr = nstr + str.charAt(i);
			}
		}
		
		System.out.println("remove spaces string is :"+nstr);
	}
	
	public static void main(String[] args) {
		Question16 obj = new Question16();
		obj.spaceRemove("hello This Is Java Program.");
	}

}
