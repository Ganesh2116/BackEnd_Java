package StringBufferStringBuilder.pkg;
// 24. Check if the StringBuffer "Java" starts with "Ja".  


public class Question24 {
	
	void print()
	{
		StringBuffer str = new StringBuffer("java");
		System.out.println("String start with ja :"+str.toString().startsWith("ja"));
		
	}
	
	public static void main(String[] args) {
		Question24 obj = new Question24();
		obj.print();
		
	}

}
