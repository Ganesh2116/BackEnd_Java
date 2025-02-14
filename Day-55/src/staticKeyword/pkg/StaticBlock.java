package staticKeyword.pkg;


public class StaticBlock {
	
	static 
	{
		System.out.println("static block 01");
	}
	
	static 
	{
		System.out.println("static block 02");
	}
	public static void main(String[] args) {
		System.out.println("this is main ");
	}

}
