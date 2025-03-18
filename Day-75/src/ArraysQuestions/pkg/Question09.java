package ArraysQuestions.pkg;


// Implement a Java program to reverse the words in a given sentence while maintaining their order.

public class Question09 {
	
	void reverseOrderWords(String str)
	{
		String word[] = str.split(" ");
		
		for (String words : word) 
		{
            StringBuilder reversedWord = new StringBuilder(words);
            System.out.print(reversedWord.reverse().toString() + " ");
        }
	}

	public static void main(String[] args) {
		Question09 obj = new Question09();
		String str = "this is java program";
		obj.reverseOrderWords(str);
	}
}
