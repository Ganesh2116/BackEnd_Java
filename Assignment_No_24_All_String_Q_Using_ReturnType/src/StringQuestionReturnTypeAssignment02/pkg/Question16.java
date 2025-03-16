package StringQuestionReturnTypeAssignment02.pkg;

// Q16.Wap enter a string and print substring of any given range.


public class Question16 {
	
	
	String  subString(String str)
	{
		return str.substring(0);
	}

	public static void main(String[] args) {
		Question16 obj = new Question16();
		String str = obj.subString("this is java program");
		System.out.println("Substring of given String :"+str);
		
	}
}
