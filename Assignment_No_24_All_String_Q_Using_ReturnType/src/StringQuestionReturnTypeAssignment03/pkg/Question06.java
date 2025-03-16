package StringQuestionReturnTypeAssignment03.pkg;

//Q6.Wap enter a string and print first non repeating character using class and object.


public class Question06 {
	
	void firstNonRepeatingChar(String str)
	{
		System.out.println("first Non repeating char :");
		for (int i=0;i<str.length();i++)
		{
			char ch  = str.charAt(i);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
			{
				System.out.print(ch);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Question06 obj = new Question06();
		String str = "this is java program";
		obj.firstNonRepeatingChar(str);
		
	}

}
