package StringQuestionReturnTypeAssignment03.pkg;

// Q3.Wap input a string and print only those word which first character is vowel.


public class Question03 {
	
	void printFirstVowelWord(String str)
	{
		String word[] = str.split(" ");
		
		System.out.println("Start with vowel :");
		for (String words :word)
		{
			char ch = Character.toLowerCase(words.charAt(0));
			if (ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'||
				ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u')
			{
				System.out.print(words+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Question03 obj = new Question03();
		String str = "this is java program u know thid code";
		obj.printFirstVowelWord(str);
	}

}



