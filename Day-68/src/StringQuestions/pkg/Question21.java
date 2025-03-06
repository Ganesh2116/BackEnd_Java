package StringQuestions.pkg;

// Write a program to check if a string is a palindrome.

public class Question21 {
	
	void palindromeStr(String str)
	{
		String rstr = "";
		
		for (int i=str.length()-1;i>=0;i--)
		{
			rstr = rstr + str.charAt(i);
		}
//		System.out.println(str);
//		System.out.println(rstr);
		
		if (str.equals(rstr))
		{
			System.out.println("This is palindrome String");
		}
		else
		{
			System.out.println("This is not palindrome String");
		}
	}
	
	public static void main(String[] args) {
		Question21 obj = new Question21();
		obj.palindromeStr("madam");
	}

}
