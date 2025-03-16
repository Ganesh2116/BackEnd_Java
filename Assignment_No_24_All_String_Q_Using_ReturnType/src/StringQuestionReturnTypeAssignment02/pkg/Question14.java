package StringQuestionReturnTypeAssignment02.pkg;

//Q14.Wap enter a string and and remove first character and print final string.


public class Question14 {
	
	void removeFirstChar(String str)
	{
		System.out.println(str.subSequence(1, str.length()));
	}
	
	public static void main(String[] args) {
		Question14 obj = new Question14();
		obj.removeFirstChar("this hello world program");
	}

}
