package interface_.pkg;

interface DemoInterface
{
	void addition();
	
	static void add()
	{
		System.out.println("static addition method");
	}
	
	default void sub()
	{
		System.out.println("this default method");
	}
}



class Child implements DemoInterface
{
	public void addition()
	{
		System.out.println("interface addition method");
		
	}
}

public class Interface_ {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.addition();
		DemoInterface.add();
		obj.sub();
	}
	

}
