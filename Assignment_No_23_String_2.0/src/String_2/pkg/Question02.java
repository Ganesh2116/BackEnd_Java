package String_2.pkg;

// Q2.Wap enter a string and find the count of word and character(excluding space).

public class Question02 {
	
	void wordCharCount(String str)
	{
		String wordCount[] = str.split(" ");
		System.out.println("Word count is :"+wordCount.length);
		
		char ch[] = str.toCharArray();
		System.out.println("Char count is :"+(ch.length-wordCount.length+1));
		
		}
	
	public static void main(String[] args) {
		Question02 obj = new Question02();
		obj.wordCharCount("this is java program and java code");
	}

}
