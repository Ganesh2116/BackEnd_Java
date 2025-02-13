package SuperKeyWord.pkg;
/*
 Write a Java program to demonstrate the use of super to call the 
 parent class constructor.
 */

class ParentQuestion
{
	ParentQuestion()
	{
		System.out.println("This is the no parameter constructor.");
	}
}

class ChildQuestion extends ParentQuestion
{
	ChildQuestion()
	{
		super();
		System.out.println("This is the Child class constructor");
	}
}

public class Question11 {
	public static void main(String[] args) {
		ChildQuestion obj = new ChildQuestion();
		
	}
}
