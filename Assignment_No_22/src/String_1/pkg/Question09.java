package String_1.pkg;

//9.Write a Java program to find the occurence of first word in the string.

public class Question09{
	
	void occurranceChar(String str,char ch)
	{
		System.out.println("occurrence of character is:"+str.indexOf(ch));
	}
	
	public static void main(String[] args) {
		Question09 obj = new Question09();
		obj.occurranceChar("this is string", 's');

	}

}
