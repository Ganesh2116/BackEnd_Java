package pollymorphism.pkg;

/*
 Write a Java program to create a base class Animal with methods eat() and sound(). 
 Create three subclasses: Lion, Tiger, and Panther. Override the eat() method in each
  subclass to describe what each animal eats. In addition, override the sound() method 
  to make a specific sound for each animal.
 */


class Animal0
{
	void eat()
	{
		System.out.println("Animal eats..");
	}
	void sound()
	{
		System.out.println("Animal sound..");
	}
}

class Lion extends Animal0
{
	void eat()
	{
		System.out.println("Lion eat meat");
	}
	void sound()
	{
		System.out.println("Lion Sound Roars");
	}
}

class Tiger extends Lion
{
	void eat()
	{
		System.out.println("Tiger eat meat");
	}
	void sound()
	{
		System.out.println("Tiger sound  Growls ");
	}
}

class Panther extends Tiger
{
	void eat()
	{
		System.out.println("Panther eat meat");
	}
	void sound()
	{
		System.out.println("panther sound Screeches");
	}
}

public class Question10 {
	public static void main(String[] args) {
		Animal0 obj;
		obj = new Animal0();
		obj.eat();
		obj.sound();
		
		obj = new Lion();
		obj.eat();
		obj.sound();
		
		obj = new Tiger();
		obj.eat();
		obj.sound();
		
		obj = new Panther();
		obj.eat();
		obj.sound();
		
		
		
	}

}
