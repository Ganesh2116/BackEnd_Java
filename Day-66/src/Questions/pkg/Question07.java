package Questions.pkg;

//Create a class Parent and a subclass Child. Use super to call the constructor and a method of the parent class.

class Parent
{
	Parent()
	{
		System.out.println("this is parent call constructor.");
	}
	
	void print()
	{
		System.out.println("this is parent method.");
	}
	
}

class Child extends Parent
{
	
	Child()
	{
		System.out.println("this is child call constructor.");
	}
	
	void print()
	{
		super.print();
		System.out.println("this is child method.");
	}
	
}

public class Question07 {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.print();
		
	}

}
