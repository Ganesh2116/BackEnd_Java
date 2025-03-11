package StringBufferStringBuilder.pkg;

// 16. Insert a boolean value true at index 5 in the StringBuffer "Java Rocks".  

public class Question16 {
	
	void print()
	{
		StringBuffer str = new StringBuffer("Java Rocks");
		System.out.println("insert boolean value true :"+str.insert(5, true));
	}
	
	public static void main(String[] args) {
		Question16 obj = new Question16();
		obj.print();
	}

}
