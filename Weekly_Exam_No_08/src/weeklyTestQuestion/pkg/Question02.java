package weeklyTestQuestion.pkg;

//2. Implement a class hierarchy where a subclass calls the superclass constructor using the super keyword and displays constructor execution order.

class SuperClass 
{
	SuperClass()
	{
		System.out.println("this superclass constucter");
	}
}


class SuperClass1 extends SuperClass 
{
	SuperClass1()
	{
		super();
		System.out.println("this superclass constucter");
	}
}

public class Question02 {
	public static void main(String[] args) {
		SuperClass1 obj = new SuperClass1();
		
		
	}

}
