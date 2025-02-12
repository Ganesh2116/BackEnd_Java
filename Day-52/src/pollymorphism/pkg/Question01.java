package pollymorphism.pkg;
/*
 Write a Java program to create a base class Animal (Animal Family) with 
 a method called Sound(). Create two subclasses Bird and Cat. Override the Sound()
  method in each subclass to make a specific sound for each animal.
 */

class Animal
{
	void sound()
	{
		System.out.println("Animal sound");
	}
}

class Bird extends Animal
{
	void sound()
	{
		System.out.println("Bird sound ");
	}
}

class Cat extends Bird
{
	void sound()
	{
		System.out.println("cat sound");
	}
}


public class Question01 {
	
	public static void main(String[] args) {
		Animal an ;
		an = new Animal();
		an.sound();
		
		an = new Bird();
		an.sound();
		
		an = new Cat();
		an.sound();
	}

}
