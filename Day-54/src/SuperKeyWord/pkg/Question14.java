package SuperKeyWord.pkg;

/*
 Implement a program where super is used to invoke the parent class method 
 that has been overridden in the child class.
 */
class Par
{
	void print()
	{
		System.out.println("This is parent method.");
	}
}

class Chil extends Par
{
	void print()
	{
		super.print();
		System.out.println("This is child method");
	}
}
public class Question14 {
	public static void main(String[] args) {
		Chil obj = new Chil();
		obj.print();
	}
	
	
}
