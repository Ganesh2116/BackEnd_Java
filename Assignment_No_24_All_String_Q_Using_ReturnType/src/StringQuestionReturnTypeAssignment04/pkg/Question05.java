package StringQuestionReturnTypeAssignment04.pkg;

// Q5.Write a Java program to remove first occurrence of a character from string.


public class Question05 {
	
	void removeFirstOccurrence(String str,char ch)
	{
		int num = str.indexOf(ch);
		for (int i=0;i<str.length();i++)
		{
			if (num != i)
			{
				System.out.print(str.charAt(i));
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "programming";
		char ch  = 'g';
		Question05 obj = new Question05();
		obj.removeFirstOccurrence(str, ch);
	}

}
