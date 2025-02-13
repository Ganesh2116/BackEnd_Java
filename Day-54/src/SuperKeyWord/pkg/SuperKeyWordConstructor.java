package SuperKeyWord.pkg;

class ParentConstructor
{
	int num ;
	ParentConstructor()
	{
		System.out.println("This is parent constructor");
	}
	void print()
	{
		System.out.println("parent method");
	}
}

class ChildConstructor extends ParentConstructor
{
	ChildConstructor()
	{
		super();
		System.out.println("This is Child Constructor");
	}
	
	void init(int num)
	{
		print();//default super keyword
		super.num = num ;
		System.out.println("This number is:"+num);
	}
}


public class SuperKeyWordConstructor {
	public static void main(String[] args) {
		ChildConstructor obj = new ChildConstructor();
		obj.init(100);
	}
	
	
	

}
