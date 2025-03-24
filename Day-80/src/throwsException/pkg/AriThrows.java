package throwsException.pkg;

public class AriThrows {
	
	static public void print() throws ArithmeticException
	{
		System.out.println(10/0);
	}
	
	void vmath()
	{
		print();
	}
	
	public static void main(String[] args) {
		
		AriThrows obj = new AriThrows();
	
		try {
			obj.vmath();
		} catch (Exception e) {
			System.out.println("handle exception");
		}
		
	}

}
