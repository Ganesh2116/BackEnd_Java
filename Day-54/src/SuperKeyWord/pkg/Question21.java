package SuperKeyWord.pkg;
/*
Write a Java program where this and super are used together in a constructor chain.
 */

class GrandFather
{
	GrandFather()
	{
		System.out.println("Grand father");
	}
}

class Father extends GrandFather
{
	Father()
	{
		super();
		System.out.println("Father");
	}
}

class Son extends Father
{
	Son()
	{
		super();
		System.out.println("Son");
	}
}

public class Question21 {
	public static void main(String[] args) {
		Son obj = new Son();
	}
	
}
