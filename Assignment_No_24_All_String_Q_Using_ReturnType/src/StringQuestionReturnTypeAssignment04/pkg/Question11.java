package StringQuestionReturnTypeAssignment04.pkg;

// Q11.Write a Java program to find last occurrence of a word in a given string.


public class Question11 {
	
	void lastOcurrenceWord(String str,String word)
	{	
		System.out.println("last occurrence is :"+str.lastIndexOf(word));
	}

	public static void main(String[] args) {
		Question11 obj = new Question11();
		String str = "this is java program";
		String word = "java";
		obj.lastOcurrenceWord(str, word);
		
	}
}
