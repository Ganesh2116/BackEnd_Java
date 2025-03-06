package StringQuestions.pkg;

//Write a program to concatenate two strings without using the concat() method.

public class Question03 {
	
	void concat(String str,String str1)
	{
		String str2 = str+" "+str1;
		System.out.println("Concatenate two string is :"+str2);
	}
	
	public static void main(String[] args) {
		Question03 obj = new Question03();
		obj.concat("hello", "world");
	}

}
