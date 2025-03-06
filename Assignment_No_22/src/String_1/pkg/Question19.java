package String_1.pkg;

// Q19.Write a Java program to find first occurrence of a character in a given string.

public class Question19 {
	
	void occurrence()
	{
		String str = "hello world hello java hello program hello";
		System.out.println("occurrence of character is:"+str.indexOf("e"));
	}
	
	public static void main(String[] args) {
		Question19 obj = new Question19();
		obj.occurrence();
	}

}
