package StringBufferStringBuilder.pkg;

//6. Reverse the StringBuffer "Hello".  


public class Question06 {
	
	void print()
	{
		StringBuffer st = new StringBuffer("Hello.");
		System.out.println("reverse :"+st.reverse());
	}
	
	public static void main(String[] args) {
		Question06 obj = new Question06();
		obj.print();
	}

}
