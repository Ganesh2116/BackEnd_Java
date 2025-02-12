package pollymorphism.pkg;

public class ComplieTime { // OverLoding
	
	void print()
	{
		System.out.println("non parameter");
	}
	
	void print(int n)
	{
		System.out.println("int parameter");
	}
	
	
	void print(String str)
	{
		System.out.println("String parameter");
	}
	
	void print(int n, String str)
	{
		System.out.println("int and String parameter");
	}
	
	void print(String str,int n)
	{
		System.out.println("String and int parameter");
	}
	public static void main(String[] args) {
		ComplieTime ct = new ComplieTime();
		ct.print();
		ct.print(12);
		ct.print("ganesh");
		ct.print(1, "ganesh");
		ct.print("ganesh", 799);
		
	}

}
