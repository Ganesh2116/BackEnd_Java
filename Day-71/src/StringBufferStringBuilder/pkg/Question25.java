package StringBufferStringBuilder.pkg;

// 25. Convert a StringBuffer to a character array and print each character separately.  


public class Question25 {
	
	void print()
	{
		StringBuffer str = new StringBuffer("java programming");
		
		char ch[] = str.toString().toCharArray();
		
		for (int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	
		
	}
	
	public static void main(String[] args) {
		Question25 obj = new Question25();
		obj.print();
		
	}

}
