package throwException.pkg;

// Throw NullPointerException if a string is null
public class ClassQuestion02 {
	
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
		ClassQuestion02 obj = new ClassQuestion02();
		obj.exception();
	}

}
