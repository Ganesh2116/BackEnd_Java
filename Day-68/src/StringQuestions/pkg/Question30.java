package StringQuestions.pkg;

// Write a program to check if a string contains only digits.

public class Question30 {
	
	void checkDigits(String str)
	{
		boolean bo = true;
		
		for (int i=0;i<str.length();i++)
		{
			if ('0' > str.charAt(i)  || str.charAt(i) > '9')
			{
				bo = false;
				break;
			}
		}
		
		if (bo)
		{
			System.out.println("This String only digits");
		}
		else
		{
			System.out.println("This String char and digits ");
		}
	}
	
	public static void main(String[] args) {
		Question30 obj = new Question30();
		obj.checkDigits("12345456");
		obj.checkDigits("123ga321");
	}

}
