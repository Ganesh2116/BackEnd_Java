package StringBufferStringBuilder.pkg;

// 2. Append " World" to a StringBuffer containing "Hello" and print the result.  


public class Question02 {
	
	void print()
	{
		StringBuffer str = new StringBuffer("Hello");
		System.out.println("String buffer text append :"+str.append(" World"));
	}
	
	public static void main(String[] args) {
		Question02 obj = new Question02();
		obj.print();
		
	}

}
