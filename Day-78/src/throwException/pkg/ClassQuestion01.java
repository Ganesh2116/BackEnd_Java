package throwException.pkg;
// Throw ArithmeticException for division by zero.

public class ClassQuestion01 {
	
	void expections()
	{
		System.out.println("hello");
		int num = 10;
		int n = 0;
		
		if ( n == 0 )
		{
			throw new ArithmeticException(" values is zero cant divided zero ");
		}
		int reu =num/n;
		System.out.println(reu);
	}
	
	public static void main(String[] args) {
		ClassQuestion01 obj = new ClassQuestion01();
		obj.expections();
	}

}
