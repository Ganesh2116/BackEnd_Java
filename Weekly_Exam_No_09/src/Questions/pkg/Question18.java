package Questions.pkg;

// 18. Mia needed to count the number of words written on the scroll. Find the word count. 


public class Question18 {
	
	void wordCount(String str)
	{
		String word[] = str.split(" ");
		System.out.println("word count is :" +word.length);
	}

	public static void main(String[] args) {
		Question18 obj = new Question18();
		String str ="this is java program";
		obj.wordCount(str);
	}
}
