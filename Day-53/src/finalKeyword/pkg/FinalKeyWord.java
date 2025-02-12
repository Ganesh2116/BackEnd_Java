package finalKeyword.pkg;

final class Number
{
	void doubleNum()
	{
		final int num =100;
		System.out.println(num);
	}
	
	void printname()
	{
		System.out.println("this final class method");
	}
}

class DoubleNumber 
{
	final void doubleNum()
	{
		final int num =20;
		System.out.println(num);
	}
	
	void printname()
	{
		System.out.println("In this class void mathod and final method");
	}
}

public class FinalKeyWord {
	public static void main(String[] args) {
		Number obj = new Number();
		obj.doubleNum();
		obj.printname();
		
		DoubleNumber obj1 = new DoubleNumber();
		obj1.doubleNum();
		obj1.printname();
		
		
	}

}
