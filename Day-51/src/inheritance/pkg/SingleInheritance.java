package inheritance.pkg;


class Parent
{
	void print() 
	{
		System.out.println("this parent class");
	}
}


class Child extends Parent
{
	void display() 
	{
		System.out.println("this child class");
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Parent pa = new Parent();
		pa.print();
		Child ch = new Child();
		ch.display();
		ch.print();
	}

}
