package StringBufferStringBuilder.pkg;


//29. Check if a given StringBuffer is empty or not.  


public class Question29 {
	
	void print()
	{
	StringBuffer str = new StringBuffer("");
	
	if (str.length() == 0)
	{
		System.out.println("String are empty");
	}
	else
	{
		System.out.println("String are not  empty");
	}
	}
	
	public static void main(String[] args) {
		Question29 obj = new Question29();
		obj.print();
	}

}
