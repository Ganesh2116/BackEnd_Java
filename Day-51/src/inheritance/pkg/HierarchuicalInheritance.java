package inheritance.pkg;

class ParentP1
{
	void print() 
	{
		System.out.println("this parent class");
	}
}


class Child1 extends ParentP1
{
	void display1() 
	{
		System.out.println("this child1 class");
	}
}

class Child2 extends ParentP1
{
	void display2() 
	{
		System.out.println("this child2 class");
	}
}
public class HierarchuicalInheritance {
	public static void main(String[] args) {
		ParentP1 pp = new ParentP1();
		pp.print();
		
		Child1 ch1 = new Child1();
		ch1.display1();
		ch1.print();
		
		Child2 ch2 = new Child2();
		ch2.display2();
		ch2.print();
	}

}
