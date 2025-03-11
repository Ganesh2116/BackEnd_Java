package StringBufferStringBuilder.pkg;

//Create a StringBuffer with the text "Hello" and print it.

public class Question01 {
	
	void print()
	{
		StringBuffer str = new StringBuffer("Hello");
		
		System.out.println("String buffer text:"+str);
	}
	
	
	public static void main(String[] args) {
		Question01 obj = new Question01();
		obj.print();
		
	}

}
