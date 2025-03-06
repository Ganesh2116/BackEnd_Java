package String_2.pkg;

//Q3.Wap input a string and print only those word which first character is vowel.

public class Question03 {
	
	void fistCharVowel(String str)
	{
		String word[] = str.split(" ");
		
		System.out.println("Start char with vowel");
		for (int i=0;i<word.length;i++)
		{
			if (word[i].charAt(0) == 'a' || word[i].charAt(0) == 'e' || word[i].charAt(0) == 'i' || word[i].charAt(0) == 'o' || word[i].charAt(0) == 'u' ||  
				word[i].charAt(0) == 'A' || word[i].charAt(0) == 'E' || word[i].charAt(0) == 'I' || word[i].charAt(0) == 'O' || word[i].charAt(0) == 'U' )
			{
				System.out.println(word[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Question03 obj = new Question03();
		obj.fistCharVowel("hello ello word this a java ihave");
	}

}
