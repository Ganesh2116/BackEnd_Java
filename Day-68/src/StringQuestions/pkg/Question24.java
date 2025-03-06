package StringQuestions.pkg;

// Write a program to print the ASCII values of all characters in a string.

public class Question24 {
	
	void asciiVlues(String str)
	{
		System.out.println("String is this :"+str);
		for (int i=0;i<str.length();i++)
		{
			
			System.out.print("Char "+str.charAt(i)+" ASCII values :");
			System.out.println((int)(str.charAt(i)));
		}
	}
	
	public static void main(String[] args) {
		Question24 obj = new Question24();
		obj.asciiVlues("ganesh bharti");
		
	}

}
