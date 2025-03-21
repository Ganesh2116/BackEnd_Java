package throwException.pkg;
// 10. Throw SecurityException for unauthorized access.
public class ClassQuestion10 {
	
	void exception()
	{
		String str = "ganesh";
		
		if (!"admin".equals(str))
		{
			throw new SecurityException(" unauthorized access");
		}
		
		System.out.println("ganesh bharti");
	}

	public static void main(String[] args) {
		ClassQuestion10 obj = new ClassQuestion10();
		obj.exception();
	}
}
