package weeklyTest.pkg;
/*
4. Create a class Animal with a method makeSound(), and a subclass Dog that overrides makeSound(). 
Use the super keyword inside Dog to call the parent class method.
 */

class Animal 
{
	void makeSound()
	{
		System.out.println("many time of sounds");
	}
}

class Dog extends Animal
{
	void makeSound()
	{
		super.makeSound();
		System.out.println("bho bho");
	}
}

public class Question04 {
	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.makeSound();
	}

}
