package Questions.pkg;

//Write a program using final keyword for a method, class, and variable.

class Pin
{
	final int pi = 3;
	final void print()
	{
		System.out.println("this final keyword "+pi);
		System.out.println("this is final method");
	}
	
}


final class Laptop 
{
	final int price = 1000;
	final void brand()
	{
		System.out.println("this tata brand");
	}
}

public class Question09 {
	public static void main(String[] args) {
		Pin obj = new Pin();
		obj.print();
	
	}
	

}
