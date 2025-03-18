package StringQuestionReturnTypeAssignment04.pkg;

// Q7.Write a Java program to remove all repeated characters from a given string.


public class Question07 {
	
	String removeRepeatedChar(String str)
	{
		String nstr = "";
		
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if (nstr.indexOf(ch) == -1)
			{
				nstr = nstr + ch;
			}
		}
	
		return nstr;
	}
	
	
	public static void main(String[] args) {
		Question07 obj = new Question07();
		String str= "this is java program";
		String result = obj.removeRepeatedChar(str);
		System.out.println(result);
	}

}
