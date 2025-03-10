package String;


// 3. Split a string by spaces and count the number of words.  


public class Question03 {
	
	void wordCount(String str)
	{
		String str1 = str.trim();
		String wordcount[] = str1.split(" ");
		
		System.out.println("word count of "+wordcount.length);
	}
	
	public static void main(String[] args) {
		Question03 obj = new Question03();
		String str = "this is java program and java codes";
		
		obj.wordCount(str);
		
	}

}
