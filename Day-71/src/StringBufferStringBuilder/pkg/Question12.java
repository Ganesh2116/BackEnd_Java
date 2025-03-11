package StringBufferStringBuilder.pkg;

public class Question12 {
	
	void print()
	{
		StringBuffer st = new StringBuffer("hello world");
		String str = new String(st);
		System.out.println("new Sting is :"+str);
	}
	
	public static void main(String[] args) {
		Question12 obj = new Question12();
		obj.print();
	}

}
