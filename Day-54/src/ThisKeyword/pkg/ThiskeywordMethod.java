package ThisKeyword.pkg;

public class ThiskeywordMethod {
	
	void m1()
	{
		System.out.println("this is m1");
		this.m2();
		this.m3();
	}
	
	void m2()
	{
		System.out.println("this is m2");
		m3();//default this keyword
	}
	
	void m3()
	{
		System.out.println("this is m3");
	}
	
	public static void main(String[] args) {
		ThiskeywordMethod obj = new ThiskeywordMethod();
		System.out.println("this is main");
		obj.m1();
	}

}
