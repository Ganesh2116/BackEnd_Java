package staticKeyword.pkg;

class Demo 
{
	static void print()
	{
		System.out.println("this is static demo class static method");
	}
	
}

public class StaticKeyWordCall {
	
	void print01()
	{
		print();
	}
	
	static void print()
	{
		Demo.print();
		System.out.println("this is main class no static method");
	}
	
	public static void main(String[] args) {
		StaticKeyWordCall obj = new StaticKeyWordCall();
		obj.print01();
	}

}
