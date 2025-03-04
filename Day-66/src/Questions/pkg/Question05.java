package Questions.pkg;

//Write a Java program to demonstrate method overloading by creating a class Calculator with multiple add() methods for different parameter types.

class Calculator
{
	void add()
	{
		int a = 10;
		int b = 20;
		System.out.println("addtion is :"+(a+b));
	}
	
	void add(int a,int b)
	{
		int c = a+b;
		System.out.println("addtion is :"+c);
	}
	
	void add(int a,double b)
	{
		double c = a+b;
		System.out.println("addtion is :"+c);
	}
}


public class Question05 {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add();
		obj.add(10, 50);
		obj.add(10, 2.5);
		
	}
}
