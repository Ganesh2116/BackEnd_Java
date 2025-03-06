package String_2.pkg;

// Q1.Wap enter a string and print it in a reverse order word by word.

public class Question01 {
	
	void reverseWord(String str)
	{
		String nstr = "";
		String word[] = str.split(" ");
		
		for (int i=word.length-1;i>=0;i--)
		{
			nstr = nstr +" "+ word[i];
		}
		
		System.out.println("Reverse word by word :"+nstr);
	}
	
	public static void main(String[] args) {
		Question01 obj = new Question01();
		obj.reverseWord("hello this is java program");
	}

}
