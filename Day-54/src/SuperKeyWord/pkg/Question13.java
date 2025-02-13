package SuperKeyWord.pkg;

/*
 Write a Java program that shows super can be used to access a parent 
 class variable when it has the same name as the child class variable.
 */

class ClassParent
{
	String name = "ganesh";
}

class ClassChild extends ClassParent
{
	void print()
	{
		String name = "rushi";
		System.out.println("This is my nane:"+super.name);
		System.out.println("This is my brother nane:"+name);
	}
}

public class Question13 {
	public static void main(String[] args) {
		ClassChild obj = new ClassChild();
		obj.print();
	}

}
