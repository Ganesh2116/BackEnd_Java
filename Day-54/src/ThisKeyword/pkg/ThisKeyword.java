package ThisKeyword.pkg;

class Demo
{
	int a;
	void method()
	{
		int a = 100;
		this.a = a;
		System.out.println(a);
		
	}
}

public class ThisKeyword {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.method();
	}

}
