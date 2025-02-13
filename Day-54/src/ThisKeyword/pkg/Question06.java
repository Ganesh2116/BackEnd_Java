package ThisKeyword.pkg;

/*
 Write a program where this is used inside an inner class to refer to 
 the outer class object.
 */

class OuterObject
{
	int rollNum = 799;
	String name = "ganesh bharti";
	boolean bu = false;
}

class InnerObject extends OuterObject
{
	void print()
	{
		System.out.println("This is roll num"+this.rollNum);
		System.out.println("This is Name"+this.name);
		System.out.println("All information is "+this.bu);
	}
}

public class Question06 {
	public static void main(String[] args) {
		InnerObject obj = new InnerObject();
		obj.print();
		
	}

}
