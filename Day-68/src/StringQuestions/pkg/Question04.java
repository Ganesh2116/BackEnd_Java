package StringQuestions.pkg;

// Write a program to check if a string is empty or not.

public class Question04 {
	
	void emptyOrNot(String str)
	{
		if (str == " ")
		{
			System.out.println("String are empty.");
		}
		else
		{
			System.out.println("String are not empty.");
		}
	}

	public static void main(String[] args) {
		Question04 obj = new Question04();
		obj.emptyOrNot(" ");
		obj.emptyOrNot("bharti");
		
	}
}
