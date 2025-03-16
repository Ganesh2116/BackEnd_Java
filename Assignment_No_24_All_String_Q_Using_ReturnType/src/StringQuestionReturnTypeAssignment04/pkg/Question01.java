package StringQuestionReturnTypeAssignment04.pkg;

// Q1.Write a Java program to find last occurrence of a character in a given string.


public class Question01 {
	
	void lastOccurrenceOfChar(String str,char ch)
	{
		int lastIndex = str.lastIndexOf(ch);
		if (lastIndex != -1)
		{
			System.out.println("last occurance of this "+ch+" is "+lastIndex);
		}
		else
		{
			System.out.println("char not found.");
		}
	}
	
	public static void main(String[] args) {
		Question01 obj = new Question01();
		String str= "this is java program";
		char ch = 'a';
		obj.lastOccurrenceOfChar(str, ch);
	}

}
