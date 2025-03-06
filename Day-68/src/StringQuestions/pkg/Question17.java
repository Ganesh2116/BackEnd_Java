package StringQuestions.pkg;

// Write a program to reverse a string without using built-in functions.

public class Question17 {
	
	void reverseStr(String str)
	{
		for (int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Question17 obj = new Question17();
		obj.reverseStr("ganesh bharti");
		
	}

}
