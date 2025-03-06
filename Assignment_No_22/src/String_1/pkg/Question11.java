package String_1.pkg;

// 11.Wap enter a string and remove all duplicate character using class and object.

public class Question11 {
	
	void removeDuplicate()
	{
		String str = "hello java hello program";
		String str1 ="";
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if (str1.indexOf(ch) == -1)
			{
				str1 = str1+ch;
			}
			
		}
		
		System.out.println("Remove Duplicate elements String is :"+str1);
	}
	
	public static void main(String[] args) {
		Question11 obj = new Question11();
		obj.removeDuplicate();
		
	}

}
