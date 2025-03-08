package Questions.pkg;

// 8. Mia discovered strange consonants in the words. Count them too.

public class Question08 {
	
	void consonantCount(String str)
	{
		char ch[] = str.toCharArray();
		int count = 0 ;
		for (int i=0;i<ch.length;i++ )
		{
			if (ch[i] != 'a'|| ch[i] != 'e'|| ch[i] != 'i'||ch[i] != 'o'||ch[i] != 'u'||
				ch[i] != 'A'|| ch[i] != 'E'|| ch[i] !='I'||ch[i] != 'O'||ch[i] !='U' || ch[i] != ' ')
			{
				count++;
			}
		}
		
		System.out.println("Consonant count is :"+count);
	}
	
	public static void main(String[] args) {
		Question08 obj = new Question08();
		String str = "java program";
		obj.consonantCount(str);
		
	}
}
