package abstarction.pkg;

/*
 Define an abstract class Medicine with an abstract method use(). 
 Implement subclasses Tablet and Syrup that define their specific uses.
 */

abstract class Medicine
{
	abstract void use();
}

class Tablet  extends Medicine
{
	void use()
	{
		System.out.println("tablet :Used to deliver medication in solid form.");
	}
}


class Syrup extends Medicine
{
	void use()
	{
		System.out.println("syrup : A liquid form of medicine, often sweetened to improve taste.");
	}
}

public class Question14 {
	public static void main(String[] args) {
		Tablet obj = new Tablet();
		obj.use();
		Syrup obj1 = new Syrup();
		obj1.use();
	}

}
