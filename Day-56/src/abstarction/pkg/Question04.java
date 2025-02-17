package abstarction.pkg;

/*
 Write an abstract class Vehicle with an abstract method startEngine().
  Implement two subclasses Car and Bike that override this method.
 */


abstract class Vehicle 
{
	abstract void startEngine();
	
}

class Car extends Vehicle
{
	void startEngine()
	{
		System.out.println("Car Engine start...");
	}
}

class Bike extends Vehicle
{
	void startEngine()
	{
		System.out.println("Bike Engine start...");
	}
}
public class Question04 {
	public static void main(String[] args) {
		Car obj = new Car();
		obj.startEngine();
		Bike ob = new Bike();
		ob.startEngine();
	}
}
