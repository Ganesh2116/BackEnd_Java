package SuperKeyWord.pkg;

/*
Create a class hierarchy where super is used to call both parent class constructors and methods.
 */

class Parent001
{
	Parent001()
	{
		System.out.println("This is parent1 class constructor");
	}
	void print()
	{
		System.out.println("This is parent1 class print method.");
	}
}

class Parent002 extends Parent001
{
	Parent002()
	{
		super();
		System.out.println("This is parent2 class constructor");
	}
	void print()
	{
		super.print();
		System.out.println("This is parent1 class print method.");
	}
}

class Child002 extends Parent002
{
	Child002()
	{
		super();
		System.out.println("This is Child002 class constructors");
	}
	void print()
	{
		super.print();
		System.out.println("This is Child class print method.");
	}
}
public class Question16 {
	public static void main(String[] args) {
		Child002 obj = new Child002();
		obj.print();
	}
	

}
