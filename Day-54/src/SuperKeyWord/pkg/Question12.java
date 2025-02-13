package SuperKeyWord.pkg;
/*
Create a program where super is used to call the parent class method 
from a child class.
 */
class ParentClass
{
	void patentMethod()
	{
		System.out.println("This is parent method");
	}
	
	void print()
	{
		System.out.println("this is parent class print method ");
	}
}


class ChildClass extends ParentClass
{
	void ChildMethod()
	{
		super.patentMethod();
		System.out.println("This is Child method");
	}
	
	void print()
	{
		super.print();
		System.out.println("this is child class print method ");
	}
}


public class Question12 {
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.ChildMethod();
		obj.print();
		
	}

}
