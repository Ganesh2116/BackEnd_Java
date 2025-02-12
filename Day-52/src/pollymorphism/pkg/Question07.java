package pollymorphism.pkg;

/*
 Write a Java program to create a base class Animal with methods move() and makeSound(). 
 Create two subclasses Bird and Panthera. Override the move() method in each subclass to describe 
 how each animal moves. Also, override the makeSound() method in each subclass to make a specific sound 
 for each animal.
 */
class Animal1
{
	void move()
	{
		System.out.println("The animal move own way...");
	}
	
	void makeSound()
	{
		System.out.println("The animal make sound own way.");
	}

}

class Bird1 extends Animal1
{
	void move()
	{
		System.out.println("The Bird move fly in sky");
	}
	
	void makeSound()
	{
		System.out.println("The Bird make sound like chrips");
	}

}

class Panthera extends Bird1
{
	void move()
	{
		System.out.println("The panthera prowls stealthily");
	}
	
	void makeSound()
	{
		System.out.println("The panthera roars loudly.");
	}

}
public class Question07 {
	public static void main(String[] args) {
		Animal1 obj;
		obj = new Animal1();
		obj.move();
		obj.makeSound();
		
		
		obj = new Bird1();
		obj.move();
		obj.makeSound();
		
		
		obj = new Panthera();
		obj.move();
		obj.makeSound();
		
		
	}
}
