package StringBufferStringBuilder.pkg;

// 17. Delete characters from index 2 to 5 in the StringBuffer "HelloWorld".  

public class Question17 {
	
	void print()
	{
		StringBuffer str = new StringBuffer("HelloWorld");
		System.out.println("delete value index 2 to 5:"+str.delete(2, 5));
	}
	
	public static void main(String[] args) {
		Question17 obj = new Question17();
		obj.print();
	}

}
