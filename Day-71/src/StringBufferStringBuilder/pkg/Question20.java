package StringBufferStringBuilder.pkg;

// 20. Check if two different StringBuffer objects with the same content are equal.  


public class Question20 {
	
	void print()
	{
		StringBuffer str = new StringBuffer("ganesh");
		StringBuffer str1 = new StringBuffer("ganesh");
		System.out.println("two stirng equal is:"+str.equals(str1));
		System.out.println("two stirng equal is:"+(str == str1));
	}
	
	public static void main(String[] args) {
		Question20 obj = new Question20();
		obj.print();
	}
}
