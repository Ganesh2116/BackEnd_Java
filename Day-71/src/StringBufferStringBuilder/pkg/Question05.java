package StringBufferStringBuilder.pkg;

//5. Delete "World" from the StringBuffer "Hello World".  


public class Question05 {
	
	void print()
	{
		StringBuffer st = new StringBuffer("Hello World");
		System.out.println("delete the world :"+st.delete(6, 12));
	}
	
	public static void main(String[] args) {
		Question05 obj = new Question05();
		obj.print();
	}

}
