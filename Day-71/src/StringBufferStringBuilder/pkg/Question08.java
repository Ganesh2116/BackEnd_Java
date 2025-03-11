package StringBufferStringBuilder.pkg;

//8. Create a StringBuffer with an initial capacity of 50 and print its capacity.  


public class Question08 {
	
	void print()
	{
		StringBuffer str =  new StringBuffer("1234567890123456789045464643541454");
		
		System.out.println("capacity of buffer is :"+str.capacity());
	}
	
	public static void main(String[] args) {
		Question08 obj = new Question08();
		obj.print();
		
	}

}