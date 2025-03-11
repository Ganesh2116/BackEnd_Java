package StringBufferStringBuilder.pkg;
// 18. Append multiple values (int, double, boolean) to a StringBuffer and print it.  


public class Question18 {
	
	void print()
	{
		StringBuffer str = new StringBuffer();
		System.out.println("append int :"+str.append(122));
		System.out.println("append boolean :"+str.append(true));
		System.out.println("append double :"+str.append(12.30));
	}
	
	public static void main(String[] args) {
		Question18 obj = new Question18();
		obj.print();
	}

}
