package String_1.pkg;

//9.Write a Java program to find the occurence of first word in the string.

public class Question09 {
	
	void occurrence()
	{
		String str = "hello world hello java hello program hello";
		int occCount =0 ;
		for (int i=1;i<str.length();i++)
		{
			if (str.charAt(0) == str.charAt(i))
			{
				occCount++;
			}
		}
		
		System.out.println("Occurrance is : "+occCount);
	}
	
	public static void main(String[] args) {
		Question19 obj = new Question19();
		obj.occurrence();
	}

}
