package pollymorphism.pkg;


class Father
{
	void repair()
	{
		System.out.println("typeWritter repariing ");
	}
}

class Child extends Father
{
	void repair()
	{
		System.out.println("typeWritter computer repariing ");
	}
}

class Gchild extends Child
{
	void repair()
	{
		System.out.println("typeWritter+computer+ masterphone");
	}
}


public class RunTime {
	
	
	public static void main(String[] args) {
		
		Father fa;
		fa = new Father();
		fa.repair();
		
		fa= new Child();
		fa.repair();
		
		fa= new Gchild();
		fa.repair();
		
	}

}
