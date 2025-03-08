package Questions.pkg;

// 19. The ancient text had repeated letters. Remove all duplicate characters. 


public class Question19 {
	
	void removeDuplicateChar(String str)
	{
		String nstr = "";
		for (int i=0;i<str.length();i++)
		{
			boolean bvalues = false;
			
			for (int j=i+1;j<str.length();j++)
			{
				if (str.charAt(i) == str.charAt(j))
				{
					bvalues = true;
					break;
				}
			}
			
			if (!bvalues)
			{
				nstr = nstr +str.charAt(i);
			}
			
		}
		
		System.out.println("remove duplicate char now string is :"+nstr);
	}
	
	public static void main(String[] args) {
		Question19 obj = new Question19();
		String str = "this is java program";
		obj.removeDuplicateChar(str);
	}
}
