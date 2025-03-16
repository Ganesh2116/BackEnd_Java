package StringQuestionReturnTypeAssignment02.pkg;

// Q13.Write a Java program to find reverse of a string using class and object.


public class Question13 {
	
	void reverse(String str)
	{
		for (int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Question13 obj = new Question13();
		obj.reverse("hello world java program");
	}

}
