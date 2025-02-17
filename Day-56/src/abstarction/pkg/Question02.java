package abstarction.pkg;

/*
 Define an abstract class Animal with an abstract method makeSound(). 
 Implement two subclasses Dog and Cat that provide specific implementations of makeSound().
 */

abstract class Animal 
{
	abstract void  makesound();
}

class Dog extends Animal 
{
	void makesound()
	{
		System.out.println("bho bho");
	}
}

class Cat extends Animal 
{
	void makesound()
	{
		System.out.println("myo myo");
	}
}
public class Question02 {
	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.makesound();
		Dog obj1 = new Dog();
		obj1.makesound();
	}

}
