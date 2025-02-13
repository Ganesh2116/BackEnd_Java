package SuperKeyWord.pkg;

class Parent1
{
	int num ;
	void print()
	{
		System.out.println("parent method");
	}
}

class Child1 extends Parent1
{
	void init(int num)
	{
		print();//default super keyword
		super.num = num ;
		System.out.println("This number is:"+num);
	}
}

public class SuperKeyWordMethod {
	public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.init(100);
	}

}
