package StringBufferStringBuilder.pkg;

//3. Insert "Java " at index 6 in the StringBuffer "Hello World".  


public class Question03 {
	
	
	void print()
	{
		StringBuffer str = new StringBuffer("Hello World");
		System.out.println("Inset the value:"+str.insert(6, "Java "));
	}
	
	public static void main(String[] args) {
		Question03 obj = new Question03();
		obj.print();
	}

}
