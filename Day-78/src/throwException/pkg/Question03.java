package throwException.pkg;

public class Question03 {
	
	void exception()
	{
		int n[] = null;
		
		if ( n == null)
		{
			throw new NullPointerException(" values not found in arrays");
		}
		
		System.out.println(n[0]);
	}
	
	public static void main(String[] args) {
		Question03 obj = new Question03();
		obj.exception();
	}

}
