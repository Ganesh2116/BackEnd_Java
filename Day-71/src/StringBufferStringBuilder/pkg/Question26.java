package StringBufferStringBuilder.pkg;

// 26. Convert a StringBuffer containing a number "12345" into an integer.  


public class Question26 {
	void print()
	{
		StringBuffer str = new StringBuffer("12345");
		 int num = Integer.parseInt(str.toString());
		 System.out.println(num);
	
	}
	public static void main(String[] args) {
		Question26 obj = new Question26();
		obj.print();
		
	}

}
