package StringQuestions.pkg;

//Write a program to insert a character at a specific position in a string.

public class Question27 {
	
	void inserChar(String str,int pos,char ch)
	{
		String nstr = "";
		
		for (int i=0;i<str.length();i++)
		{
			if (i == pos-1)
			{
				nstr += ch;
			}
			nstr += str.charAt(i);
			
		}
		
		System.out.println("now String is:"+nstr);
	}
	
	public static void main(String[] args) {
		Question27 obj = new Question27();
		obj.inserChar("ganesh", 2, 'n');
		
	}

}
