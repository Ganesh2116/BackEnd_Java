package StringQuestionReturnTypeAssignment04.pkg;

// Q6.Write a Java program to remove last occurrence of a character from string.


public class Question06 {
	
	void removelastOccurrencChar(String str,char ch)
	{
		int num = str.lastIndexOf(ch);
		
		for (int i=0;i<str.length();i++)
		{
			if (num != i)
			{
				System.out.print(str.charAt(i));
			}
		}
	}
	
	
	public static void main(String[] args) {
		Question06 obj = new Question06();
		String str = "programming";
		char ch = 'r';
		obj.removelastOccurrencChar(str, ch);
	}
}
