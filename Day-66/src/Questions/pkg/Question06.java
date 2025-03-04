package Questions.pkg;

// Implement method overriding by creating a superclass Bird with a method fly(). Override it in the subclass Eagle.

class Bird
{
	void fly()
	{
		System.out.println("birds fly....");
	}
}

class Eagle extends Bird
{
	void fly()
	{
		System.out.println("eagle fly...");
	}
}

public class Question06 {
	public static void main(String[] args) {
		Bird obj = new Eagle();
		Bird obj1 = new Bird();
		obj1.fly();
		obj.fly();
	}
	
	
}
