package StringQ.pkg;

// 6. Write a Java class that accepts a sentence, splits it into words, and stores each word in an array, then reconstructs the sentence using StringBuilder.  


public class Question06 {
	
	void wordArrays(String str)
	{
		String words[] = str.split(" ");
		
		StringBuffer wordString = new StringBuffer();
		
		for ( int i=0;i<words.length;i++)
		{
			wordString.append(words[i]+" ");
		}
		
		System.out.println("Now StingBuffer is :"+wordString);
	}
	
	public static void main(String[] args) {
		Question06 obj = new Question06();
		String str =" this is java program";
		obj.wordArrays(str);
	}

}
