package StringBufferStringBuilder.pkg;

// 22. Find the index of the first occurrence of 'a' in the StringBuffer "Java Programming".  


public class Question22 {
	
	void print()
	{
		StringBuffer str = new StringBuffer("Java Programming");
		System.out.println("Occurrence of a :"+str.indexOf("a"));
		
	}
	
	public static void main(String[] args) {
		Question22 obj = new Question22();
		obj.print();
		
	}

}
