package ThisKeyword.pkg;

public class ThisKeyWordway2 {
	
	void m1()
	{
		System.out.println("this is m1");
		m2();//default this keyword
	}
	
	void m2()
	{
		System.out.println("this is m2");
		this.m3();
	}
	
	void m3()
	{
		System.out.println("this is m3");
	}
	
	public static void main(String[] args) {
		ThisKeyWordway2 obj = new ThisKeyWordway2();
		System.out.println("this is main");
		obj.m1();
		
	}

}
