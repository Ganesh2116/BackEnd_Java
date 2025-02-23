package weeklyTestQuestion.pkg;


//6. Create a Java program where static blocks are executed before the main method and demonstrate their order of execution.

public class Question06 {
	static
	{
		System.out.println("this is static block");
	}
	public static void main(String[] args) {
		System.out.println("this is main class ");
	}

}
