package StringBufferStringBuilder.pkg;

// 15. Append a float 45.67 to a StringBuffer "Value: " and print the result.  

public class Question15 {
	
	void print()
	{
		StringBuffer str = new StringBuffer("Number : ");
		System.out.println("Append is :"+str.append("45.67"));
		
	}
	
	public static void main(String[] args) {
		Question15 obj = new Question15();
		obj.print();
	}

}