package StringQuestionReturnTypeAssignment03.pkg;

//Q10. Write a Java program to read a given string and if the first or last characters are same
//return the string without those characters otherwise return the string unchanged

public class Question10 {
	String str = "tatat";
	
	void sameChar()
	{
		if (str.charAt(0) == str.charAt(str.length()-1))
		{
			System.out.println(str.substring(1,str.length()-1));
		}
		else
		{
			 System.out.println(str.substring(0,str.length()));
		}
	}
	
	public static void main(String[] args) {
		Question10 obj = new Question10();
		obj.sameChar();
	}

}