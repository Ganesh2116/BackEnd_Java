package SuperKeyWord.pkg;

/*
 Write a program where this is used inside a method and super is used inside the constructor 
 in a parent-child class relationship.
 */


class CatAnimal
{
	CatAnimal()
	{
		System.out.println("This is catanimal constructor");
	}
	
}

class BirdFly extends CatAnimal
{
	BirdFly()
	{
		super();
		System.out.println("This is BirdFly constructor");
	}
	
	void print()
	{
		System.out.println("this is Birdfly print method");
	}
	
	void print1()
	{
		this.print();
		System.out.println("this is Birdfly print first method");
	}
}


public class Question23 {
	public static void main(String[] args) {
		BirdFly obj = new BirdFly();
		obj.print1();
	}

}
