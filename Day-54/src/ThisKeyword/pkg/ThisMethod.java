package ThisKeyword.pkg;

public class ThisMethod {
	
	void m1()
	{
		System.out.println("this is m1");
		
	}
	
	void m2()
	{
		this.m1();
		System.out.println("this is m2");
		this.m3();
	}
	
	void m3()
	{
		System.out.println("this is m3");
	}
	
	public static void main(String[] args) {
		ThisMethod obj = new ThisMethod();
		System.out.println("this is main");
		obj.m2();
	}

}
