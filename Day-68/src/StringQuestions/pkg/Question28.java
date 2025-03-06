package StringQuestions.pkg;

//Write a program to split a string into words and print each word separately

public class Question28 {
	
	void separatelyPrintWord(String str)
	{
		String sstr[] = str.split(" ");
		
		System.out.println("Each word separately : ");
		for (String word : sstr)
		{
		System.out.println(word);
		}
	}
	
	public static void main(String[] args) {
		Question28 obj = new Question28();
		obj.separatelyPrintWord("hello world this is java program");
	}

}
