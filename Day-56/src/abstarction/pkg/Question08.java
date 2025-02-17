package abstarction.pkg;
/*
 Write an abstract class Bird with an abstract method fly(). 
 Implement subclasses Sparrow and Penguin to define their own flying behavior.
 */

abstract class Bird
{
	abstract void fly();
}

class Sparrow extends Bird
{
	void fly()
	{
		System.out.println("sparrow flying sky");
	}
}

class Penguin extends Bird
{
	void fly()
	{
		System.out.println("Penguin flying sky");
	}
}
public class Question08 {
	public static void main(String[] args) {
		Sparrow obj = new Sparrow();
		obj.fly();
		Penguin obj1 = new Penguin();
		obj1.fly();
	}

}
