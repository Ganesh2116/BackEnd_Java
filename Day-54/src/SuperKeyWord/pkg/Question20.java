package SuperKeyWord.pkg;

/*
 Write a Java program to show that super must be the first statement inside a child class constructor.
 */

class Birds
{
	Birds()
	{
		System.out.println("This is birds");
	}
}

class Cat extends Birds
{
	Cat()
	{
		super();
		System.out.println("this is cat");
	}
}
public class Question20 {
	public static void main(String[] args) {
		Cat obj = new Cat();
	}

}
