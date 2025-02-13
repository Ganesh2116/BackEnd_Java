package SuperKeyWord.pkg;

/*
 Create a Java program where a child class constructor uses both this and super to manage
 constructor chaining efficiently.
 */

class ConstructorChianGrand
{
	ConstructorChianGrand()
	{
		this(true);
		System.out.println("This is constructor Chian Grand");
	}
	
	ConstructorChianGrand(boolean fa)
	{
		System.out.println("This is constructor Chian Grand");
	}
}

class ConstructorChianParent extends ConstructorChianGrand
{
	ConstructorChianParent()
	{
		this(2116);
		System.out.println("This is constructor Chian parent");
	}
	
	ConstructorChianParent(int num)
	{
		super();
		System.out.println("This is constructor Chian parent number :"+num);
	}
}

class ConstructorChianChild extends ConstructorChianParent
{
	ConstructorChianChild()
	{
		this("ganesh bharti");
		System.out.println("This is constructor Chian Child");
	}
	
	ConstructorChianChild(String name)
	{
		super();
		System.out.println("This is constructor Chian Child name "+name);
	}
}
public class Question22 {
	public static void main(String[] args) {
		ConstructorChianChild obj = new ConstructorChianChild();
		
	}

}
