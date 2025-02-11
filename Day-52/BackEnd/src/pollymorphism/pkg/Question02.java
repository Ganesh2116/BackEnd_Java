package pollymorphism.pkg;

/*
Write a Java program to create a class Vehicle with a method called speedUp(). 
Create two subclasses Car and Bicycle. Override the speedUp() method in each 
subclass to increase the vehicle's speed differently.
 */


class Vehical
{
	void speedUp()
	{
		System.out.println("Speed 50");
	}
}


class Car extends Vehical
{
	void speedUp()
	{
		System.out.println("Speed 100");
	}
}

class Bicycle extends Car
{
	void speedUp()
	{
		System.out.println("Speed 120");
	}
}

public class Question02 {
	
	public static void main(String[] args) {
		
		Vehical ve;
		ve = new Vehical();
		ve.speedUp();
		
		ve= new Car();
		ve.speedUp();
		
		ve = new Bicycle();
		ve.speedUp();
		
	}

}
