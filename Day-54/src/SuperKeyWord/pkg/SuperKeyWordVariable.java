package SuperKeyWord.pkg;


class Parent
{
	int num ;
	void print()
	{
		System.out.println("parent method");
	}
}

class Child extends Parent
{
	void init(int num)
	{
		super.num = num ;
		System.out.println("This number is:"+num);
	}
	
	void print()
	{
		System.out.println("Child method");
	}
}

public class SuperKeyWordVariable {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.init(100);
	}

}
