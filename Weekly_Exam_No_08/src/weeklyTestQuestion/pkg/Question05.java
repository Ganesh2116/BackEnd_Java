package weeklyTestQuestion.pkg;



//5. Implement a program that uses the super keyword to call both a superclass method and a constructor from the subclass.  

class Father 
{
	int num =90;
	Father()
	{
		System.out.println("calling this super class method");
	}
	
	void print()
	{
		System.out.println("this is print method ");
	}
}

class Child extends Father
{
	Child()
	{
		super();
		System.out.println("this child consturctor");
	}
	void childMethod()
	{
		int num = 89;
		super.num = num;
		System.out.println("int is "+num);
		System.out.println("this calling method");
	}
}


public class Question05 {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.childMethod();
	}

}
