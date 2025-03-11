package StringBufferStringBuilder.pkg;

// 27. Append a substring of another String to a StringBuffer and print the result.  


public class Question27 {
	
	void print()
	{
		StringBuffer str = new StringBuffer("java");
		String str1 = "programming";
		System.out.println(str.append(" "+str1.substring(0, 5)));
	
	}
	public static void main(String[] args) {
		Question27 obj = new Question27();
		obj.print();
		
	}

}
