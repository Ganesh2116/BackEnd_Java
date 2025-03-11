package StringBufferStringBuilder.pkg;

// 28. Delete the last character of a StringBuffer dynamically and print the result.  


public class Question28 {
	
	void print()
	{
		StringBuffer str = new StringBuffer("java");
		System.out.println(str.delete(str.length()-1,str.length()));
	
	}
	public static void main(String[] args) {
		Question28 obj = new Question28();
		obj.print();
		
	}
}
