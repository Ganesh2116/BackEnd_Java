package StringQuestionReturnTypeAssignment04.pkg;

// Q13.Write a Java program to count occurrences of a word in a given string.

public class Question13 {
	
	int  countOcurrenceWord(String str,String word)
	{
		String words[] = str.split(" ");
		int count = 0;
		for (int i=0;i<words.length;i++)
		{
			if (word.equals(words[i]))
			{
				count++;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		Question13 obj = new Question13();
		String str = "java class java program and java coding java";
		String word = "java";
		int result = obj.countOcurrenceWord(str, word);
		
		
		System.out.println("In string word  occurences count is :"+result);
		
	}

}