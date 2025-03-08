package Questions.pkg;

//7. Ryan found special vowels hidden in the text. Count how many there are. 


public class Question07 {
	
	
	void vowelsCount(String str)
	{
		char ch[] = str.toCharArray();
		int count = 0 ;
		for (int i=0;i<ch.length;i++ )
		{
			if (ch[i] == 'a'|| ch[i] == 'e'|| ch[i] == 'i'||ch[i] == 'o'||ch[i] == 'u'||
				ch[i] == 'A'|| ch[i] == 'E'|| ch[i] == 'I'||ch[i] == 'O'||ch[i] == 'U')
			{
				count++;
			}
		}
		
		System.out.println("Vowel count is :"+count);
	}
	
	public static void main(String[] args) {
		Question07 obj = new Question07();
		String str = "java prgram";
		obj.vowelsCount(str);
	}

}
