package StringBufferStringBuilder.pkg;

// 14. Append an integer 123 to a StringBuffer "Number: " and print the result.  


public class Question14 {
	
	void print()
	{
		StringBuffer str = new StringBuffer("Number : ");
		System.out.println("Append is :"+str.append("123"));
		
	}
	
	public static void main(String[] args) {
		Question14 obj = new Question14();
		obj.print();
	}

}
