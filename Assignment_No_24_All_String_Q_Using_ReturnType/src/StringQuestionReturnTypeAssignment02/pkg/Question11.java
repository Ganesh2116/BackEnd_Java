package StringQuestionReturnTypeAssignment02.pkg;

// 11.Wap enter a string and remove all duplicate character using class and object.


public class Question11 {
	
	void removeDuplicateChar(String str)
	{
		String nstr = "";
		
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if (nstr.indexOf(ch) == -1)
			{
				nstr += ch;
			}
		}
		
		System.out.println("Remove duplication :"+nstr);
	}
	
	public static void main(String[] args) {
		Question11 obj = new Question11();
		obj.removeDuplicateChar("this is java program");
	}

}
