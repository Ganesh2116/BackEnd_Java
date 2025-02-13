package ThisKeyword.pkg;

/*
 Write a Java program to demonstrate how this can be used in setter 
 methods to return the current object for method chaining.
 */

class Methods
{
	int num = 100;
	
	void ex() 
	{
		System.out.println("method chaining example1 "+this.num);
	}
	
	void ex1() 
	{
		ex();
		System.out.println("method chaining example2 "+this.num);
	}
	
	void ex2() 
	{
		ex1();
		System.out.println("method chaining example3 "+this.num);
	}
}

public class Question10 {
	public static void main(String[] args) {
		Methods obj = new Methods();
		obj.ex2();
	}

}
