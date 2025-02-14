package staticKeyword.pkg;

public class ConstructorStaticBlocks {
	
	ConstructorStaticBlocks() 
	{
		
		System.out.println("this is Consturctor block");
	}
	
	{
		System.out.println("instance block");
	}
	
	static 
	{
		System.out.println("static blocks 01");
	}
	
	static 
	{
		System.out.println("static blocks 02");
	}
	
	static 
	{
		System.out.println("static blocks 03");
	}
	
	
	public static void main(String[] args) 
	{
		ConstructorStaticBlocks obj = new ConstructorStaticBlocks();
		System.out.println("this is main");
	}

}
