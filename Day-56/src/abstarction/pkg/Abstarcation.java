package abstarction.pkg;

abstract class Parent
{
	abstract void addition();
}

class Child extends Parent
{
	void addition()
	{
		int a =10;
		int b= 20;
		System.out.println("addition is :"+(a+b));
	}
}
public class Abstarcation {
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.addition();
		
	}

}
