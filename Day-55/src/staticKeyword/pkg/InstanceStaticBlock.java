package staticKeyword.pkg;


public class InstanceStaticBlock {
	
	static 
	{
		System.out.println("static blocks 01");
	}
	
	static 
	{
		System.out.println("static blocks 02");
		InstanceStaticBlock obj = new InstanceStaticBlock();
	}
	
	//instance block
		{
			System.out.println("Instance blocks 01");
		}
	
	//static block
	static 
	{
		System.out.println("static blocks 03");
	}

	public static void main(String[] args) {
		System.out.println("This is main ");
	}
}
