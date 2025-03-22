package WeeklyQuestions.pkg;

//Q.4.Write a program to reverse string using class and object .

public class Question04 {
	
	void reverseStr(String str)
	{
		for (int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		Question04 obj = new Question04();
		String str  = "this is java program";
		obj.reverseStr(str);
	}

}
