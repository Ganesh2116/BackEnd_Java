package StringBufferStringBuilder.pkg;

// 11. Modify the character at index 0 of the StringBuffer "Java" to 'Y'.  

public class Question11 {
	
	void print()
	{
		StringBuffer str = new StringBuffer("Java");
		
		System.out.println("change index 0 :"+str.replace(0, 1,"Y"));
	}
	
	public static void main(String[] args) {
		Question11 obj = new Question11();
		obj.print();
	}

}
