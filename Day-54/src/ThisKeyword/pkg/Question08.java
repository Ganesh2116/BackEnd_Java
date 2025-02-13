package ThisKeyword.pkg;

/*
 Write a class where a method calls another method of the same class 
 using this
 */

public class Question08 {
	
	void print()
	{
		print3();//default this keyword
		System.out.println("this is first method");
	}
	

	void print2()
	{
		print();
		System.out.println("this is 2nd method");
	}
	

	void print3()
	{
		System.out.println("this is 3rd method");
	}
	
	public static void main(String[] args) {
		Question08 obj = new Question08();
		obj.print2();
	}

}
