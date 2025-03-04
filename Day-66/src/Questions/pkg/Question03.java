package Questions.pkg;

//Write a Java program to implement an abstract class Animal with an abstract method makeSound(). Create subclasses Dog and Cat to implement the method.


abstract class Animal
{
	abstract void makeSound();
}

class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("bho bho");
	}
}

class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("maiu maiu");
	}
}
public class Question03 {
	public static void main(String[] args) {
		Animal obj = new Dog();
		obj.makeSound();
		Animal obj1 = new Cat();
		obj1.makeSound();
	}

}
