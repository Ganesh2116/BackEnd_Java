package StringQuestionReturnTypeAssignment03.pkg;

// Q1.Wap enter a string and print it in a reverse order word by word.


public class Question01 {
	
	void reverseOrderWord(String str)
	{
		String word[] = str.split(" ");
		
		for (int i=word.length-1;i>=0;i--)
		{
			System.out.print(word[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Question01 obj = new Question01();
		String str = "this is java program";
		
		obj.reverseOrderWord(str);
	}
}
