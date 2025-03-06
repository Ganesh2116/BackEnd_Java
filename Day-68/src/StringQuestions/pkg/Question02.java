package StringQuestions.pkg;

//Write a program to find the length of a given string.

public class Question02 {
	
	void findLength(String str)
	{
		System.out.println("Length of String is:"+str.length());
	}
	
	public static void main(String[] args) {
		Question02 obj = new Question02();
		obj.findLength("hello world");
	}

}
