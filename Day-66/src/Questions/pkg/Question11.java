package Questions.pkg;

// Create a Person class with attributes name and age. Derive a class Employee with an additional attribute salary. Demonstrate constructor chaining.

class Person
{
	Person(String name,int age)
	{
		System.out.println("name is :"+name);
		System.out.println("age is :"+age);
	}
}

class Child2 extends Person
{
	Child2()
	{
		super("ganesh",23);
		int sal = 25000;
		System.out.println("salary is :"+sal);
	}
}

public class Question11 {
	public static void main(String[] args) {
		Child2 obj = new Child2();
		
	}

}
