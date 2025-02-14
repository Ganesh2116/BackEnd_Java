package staticKeyword.pkg;

public class StaticKeyword {
	
	static int num = 100;
	
	void print()
	{
		System.out.println("This is static keyword : "+num);
		num++;
	}
	public static void main(String[] args) {
		StaticKeyword obj = new StaticKeyword();
		StaticKeyword obj1 = new StaticKeyword();
		StaticKeyword obj2 = new StaticKeyword();
		StaticKeyword obj3 = new StaticKeyword();
		StaticKeyword obj4 = new StaticKeyword();
		obj.print();
		obj1.print();
		obj2.print();
		obj3.print();
		obj4.print();
		
		
	}

}
