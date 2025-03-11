package StringBufferStringBuilder.pkg;

// 13. Find and print the length of the StringBuffer "Programming".  


public class Question13 {
	
	void print()
	{
		StringBuffer str = new StringBuffer("Programming");
		System.out.println("length is str: "+str.length());
	}
	public static void main(String[] args) {
		Question13 obj = new Question13();
		obj.print();
	}

}
