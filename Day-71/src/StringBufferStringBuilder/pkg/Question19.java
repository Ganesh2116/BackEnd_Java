package StringBufferStringBuilder.pkg;

// 19. Convert a StringBuffer "Hello" to uppercase using String methods.  

public class Question19 {
	
	void print()
	{
		StringBuffer str = new StringBuffer("Hello");
		System.out.println("upper case :"+str.toString().toUpperCase());
		
	}
	
	public static void main(String[] args) {
		Question19 obj = new Question19();
		obj.print();
	}

}
