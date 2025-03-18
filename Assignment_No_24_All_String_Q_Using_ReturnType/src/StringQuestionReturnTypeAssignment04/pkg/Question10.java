package StringQuestionReturnTypeAssignment04.pkg;

//Q10.Write a Java program to replace all occurrences of a character with another in a string.


public class Question10 {
	
	void replaceAllOccureance(String str,char ch ,char nch)
	{
			System.out.println(str.replace(ch, nch));
	}
	
	public static void main(String[] args) {
		Question10 obj= new Question10();
		String str ="this is java program";
		char ch = 'a';
		char nch = 'z';
		obj.replaceAllOccureance(str, ch, nch);
	}

}
