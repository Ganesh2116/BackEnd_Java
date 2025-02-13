package ThisKeyword.pkg;
/*
 Write a Java program where this is used to invoke a constructor 
 within the same class.
 */

class InvokeConstructor
{
	InvokeConstructor()
	{
		this(799);
		System.out.println("This is constructor");
	}
	
	InvokeConstructor(int num)
	{
		
		System.out.println("This parameter constructor");
	}
}

public class Question03 {
	public static void main(String[] args) {
		InvokeConstructor obj = new InvokeConstructor();
	}

}
