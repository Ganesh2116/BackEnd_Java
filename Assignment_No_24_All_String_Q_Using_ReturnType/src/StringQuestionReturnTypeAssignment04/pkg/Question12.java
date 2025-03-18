package StringQuestionReturnTypeAssignment04.pkg;

//Q12.Write a Java program to search all occurrences of a word in given string.


public class Question12 {
	
	void allOcurrenceWord(String str,String word)
	{
		String words[] = str.split(" ");
		
		System.out.println("In string word All occurences is :");
		for (int i=0;i<words.length;i++)
		{
			if (word.equals(words[i]))
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		Question12 obj = new Question12();
		String str = "java class java program and java coding java";
		String word = "java";
		obj.allOcurrenceWord(str, word);
		
	}

}
