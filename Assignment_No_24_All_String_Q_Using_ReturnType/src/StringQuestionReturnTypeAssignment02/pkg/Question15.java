package StringQuestionReturnTypeAssignment02.pkg;

// Q15.Wap enter a string and and remove last character and print final string.


public class Question15 {
	
	void removeLastChar(String str)
	{
		System.out.println(str.subSequence(1, str.length()-1));
	}
	
	public static void main(String[] args) {
		Question15 obj = new Question15();
		obj.removeLastChar("this hello world program");
	}

}
