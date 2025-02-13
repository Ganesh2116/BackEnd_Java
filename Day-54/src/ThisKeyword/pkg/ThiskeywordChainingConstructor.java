package ThisKeyword.pkg;

public class ThiskeywordChainingConstructor {
	
	ThiskeywordChainingConstructor()
	{
		this(10);
		System.out.println("this is no parameter constructor");
	}
	
	ThiskeywordChainingConstructor(int num)
	{
		this("ganesh");
		System.out.println("this is int parameter constructor");
	}
	
	ThiskeywordChainingConstructor(String str)
	{
		System.out.println("this is String parameter constructor");
	}
	public static void main(String[] args) {
		ThiskeywordChainingConstructor obj = new ThiskeywordChainingConstructor();
		
	}

}
