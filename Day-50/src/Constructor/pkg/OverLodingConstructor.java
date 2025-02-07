package Constructor.pkg;

public class OverLodingConstructor {
		
		
	OverLodingConstructor()
	{
		System.out.println("without parameter constructor");
	}
	
	OverLodingConstructor(String name)
	{
		System.out.println("with String parameter constructor");
	}
	
	OverLodingConstructor(int a)
	{
		System.out.println("with int parameter constructor");
	}
	
	public static void main(String[] args) {
		OverLodingConstructor ob = new OverLodingConstructor();
		OverLodingConstructor ob1 = new OverLodingConstructor("ganesh");
		OverLodingConstructor ob2 = new OverLodingConstructor(799);
	}

}
