package SuperKeyWord.pkg;

/*
 Create a Java program where the child class constructor uses super to call a parameterized 
 constructor of the parent class.
 */

class Example
{
	Example(int num)
	{
		System.out.println("This is number example :"+num);
	}
}

class Problem extends Example
{
	 Problem()
	 {
		 super(745);
		 System.out.println("This is problem of Child class Constructor");
	 }
}
public class Question19 {
	public static void main(String[] args) {
		Problem obj = new Problem();
	}

}
