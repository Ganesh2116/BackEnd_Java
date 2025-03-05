package String_1.pkg;

// Q21. Wap enter a string and print all duplicate character.

public class Question21 {
	
	void duplicateChar()
	{
		String str = "hello world hello java";
		
		System.out.println("Duplicate char is :");
		for (int i=0;i<str.length();i++)
		{
			for (int j=i+1;j<str.length();j++)
			{
				if (str.charAt(i) == str.charAt(j))
				{
					System.out.print(str.charAt(j)+" ");
					break;
				}
					
			}
		}
	}

	public static void main(String[] args) {
		Question21 obj = new Question21();
		obj.duplicateChar();
	}
}
