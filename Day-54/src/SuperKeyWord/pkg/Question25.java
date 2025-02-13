package SuperKeyWord.pkg;

/*
Write a Java program that demonstrates method chaining using this while also calling a parent 
class method using super.
 */

class Exm01
{
	void print()
	{
		System.out.println("This is last parent class");
	}
}

class ChildLast extends Exm01
{
	void print()
	{
		this.print1();
		System.out.println("this last child print");
	}
	
	void print1()
	{
		this.print2();
		System.out.println("this last child print1");
	}
	
	void print2()
	{
		super.print();
		System.out.println("this last child print2");
	}
	
	
}
public class Question25 {
	public static void main(String[] args) {
		ChildLast obj = new ChildLast();
		obj.print();
	}

}
