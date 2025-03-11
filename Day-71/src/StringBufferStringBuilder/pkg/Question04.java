package StringBufferStringBuilder.pkg;
// 4. Replace "World" with "Java" in the StringBuffer "Hello World".  


public class Question04 {
	
	void print()
	{
		StringBuffer str = new StringBuffer("Hello World");
		System.out.println("Inset the value:"+str.replace(6, 12,"Java"));
	}

	
	public static void main(String[] args) {
		Question04 obj = new Question04();
		obj.print();
	}
}
