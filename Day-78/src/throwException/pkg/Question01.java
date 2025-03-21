package throwException.pkg;

public class Question01 {
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
		Question01 obj = new Question01();
		obj.expections();
	}
}
