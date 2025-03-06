package StringQuestions.pkg;

// Write a program to remove duplicate characters from a string.

public class Question25 {
	
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
		Question25 obj = new Question25();
		obj.removeDuplicateChar("ganesh bharti");
	}

}
