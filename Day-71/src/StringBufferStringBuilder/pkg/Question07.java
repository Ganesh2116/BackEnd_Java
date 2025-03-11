package StringBufferStringBuilder.pkg;


// 7. Find and print the capacity of an empty StringBuffer.  

public class Question07 {
	
	void print()
	{
		StringBuffer str =  new StringBuffer();
		
		System.out.println("capacity of buffer is :"+str.capacity());
	}
	
	public static void main(String[] args) {
		Question07 obj = new Question07();
		obj.print();
		
	}

}
