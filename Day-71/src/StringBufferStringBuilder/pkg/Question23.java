package StringBufferStringBuilder.pkg;

// 23. Find the last index of 'g' in the StringBuffer "Programming".  


public class Question23 {
	
	void print()
	{
		StringBuffer str = new StringBuffer("Programming");
		System.out.println("last index of g :"+str.lastIndexOf("g"));
		
	}
	
	public static void main(String[] args) {
		Question23 obj = new Question23();
		obj.print();
		
	}

}