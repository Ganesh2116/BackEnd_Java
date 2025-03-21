package throwException.pkg;

public class Question04 {
	
	void exception()
	{
		int Size = -10;
		int n[] = new int[Size];
		
		if ( n.length >0)
		{
			throw new NegativeArraySizeException(" arrays length in negtive");
		}
		
		System.out.println(n[0]);
	}
	
	public static void main(String[] args) {
		Question04 obj = new Question04();
		obj.exception();
	}

}
