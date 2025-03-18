package StringQuestionReturnTypeAssignment04.pkg;

// Q8.Write a Java program to replace first occurrence of a character with another in a string.


public class Question08 {
	
	void replaceFirstOccurrence(String str,char ch,char replaceChar)
	{
		int num = str.indexOf(ch);
		System.out.println(str.replace(str.charAt(num), replaceChar));
	}
	
	
	public static void main(String[] args) {
		Question08 obj = new Question08();
		String str = "programming in java coding";
		char ch = 'p';
		char rch = 'z';
		
		obj.replaceFirstOccurrence(str, ch, rch);
	}

}
