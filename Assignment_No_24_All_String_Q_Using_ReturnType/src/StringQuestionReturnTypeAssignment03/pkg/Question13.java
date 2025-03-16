package StringQuestionReturnTypeAssignment03.pkg;

//Q13. Write a Java program to create a new string repeating every character twice of a
//given string.
//Sample Output:
//The given string is: welcome
//The new string is: wweellccoomme



public class Question13 {
	
	String str = "welcome";
	
	void everyCharDouble()
	{
		String sr = "";
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			sr = sr +ch +ch;
		}
		
		System.out.println("The given string is :"+str);
		System.out.println("The new sting is :"+sr);
	}
	
	public static void main(String[] args) {
		Question13 obj = new Question13();
		obj.everyCharDouble();
	}

}