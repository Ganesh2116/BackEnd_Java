package inheritance.pkg;

class Parents
{
	void print() 
	{
		System.out.println("this parent class");
	}
}


class Childs extends Parents
{
	void display() 
	{
		System.out.println("this child class");
	}
}

class GrandChild extends Child
{
	void showOff() 
	{
		System.out.println("this Grandchild class");
	}
}


class GreatGrandChild extends GrandChild
{
	void show() 
	{
		System.out.println("this Greatgrandchild class");
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
	
		Parents pa = new Parents();
		pa.print();
		
		Childs ch = new Childs();
		ch.display();
		ch.print();
		
		GrandChild gc = new GrandChild();
		gc.showOff();
		gc.display();
		gc.print();
		
		GreatGrandChild ggc = new GreatGrandChild();
		ggc.show();
		ggc.showOff();
		ggc.display();
		ggc.print();
	}
}
