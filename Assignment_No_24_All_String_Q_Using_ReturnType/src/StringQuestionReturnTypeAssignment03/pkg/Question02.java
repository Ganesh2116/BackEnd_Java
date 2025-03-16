package StringQuestionReturnTypeAssignment03.pkg;

// Q2.Wap enter a string and find the count of word and character(excluding space).


public class Question02 {
	
	String WordCharCount(String str)
	{
		String nstr = str.trim();
		int wordCount = 1 ;
		int charCount = 0;
		for(int i=0;i<nstr.length();i++)
		{
			if (nstr.charAt(i) != ' ')
			{
				charCount++;
			}
			else
			{
				wordCount++;
			}	
		}
		
		return "word count is "+wordCount+" char count is: "+charCount;
	}
	
	public static void main(String[] args) {
		Question02 obj = new Question02();
		
		String str = "this is java program  ";
		String result = obj.WordCharCount(str);
		System.out.println(result);
		
	}

}
