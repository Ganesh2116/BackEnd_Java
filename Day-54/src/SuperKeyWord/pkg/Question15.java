package SuperKeyWord.pkg;

/*
 Write a Java program to demonstrate how super can be used in multi-level 
 inheritance.
 */

class Parent01
{
	void print()
	{
		System.out.println("This is parent class");
	}
}

class Child01 extends Parent01
{
	void print1()
	{
		System.out.println("This is Child class");
	}
}

class GChild extends Child01 
{
	void print01()
	{
		super.print();
		super.print1();
		System.out.println("This is Grand Child class");
	}
}

public class Question15 {
	public static void main(String[] args) {
		GChild obj = new GChild();
		obj.print01();
	}

}
