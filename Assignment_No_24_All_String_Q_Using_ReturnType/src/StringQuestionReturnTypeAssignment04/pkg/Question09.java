package StringQuestionReturnTypeAssignment04.pkg;

// Q9.Write a Java program to replace last occurrence of a character with another in a string.


public class Question09 {
	
	void replaceLastOccurrencChar(String str,char ch,char rch)
	{
		int num = str.lastIndexOf(ch);
		System.out.println(str.replace(str.charAt(num), rch));
	}
	
	public static void main(String[] args) {
		Question09 obj = new Question09();
		String str = "this is java programming";
		char ch = 'p';
		char rch = 'q';
		obj.replaceLastOccurrencChar(str, ch, rch);
	}

}
