package pollymorphism.pkg;

/*
 Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine().
 Create two subclasses Car and Motorcycle. Override the startEngine() and stopEngine() methods 
 in each subclass to start and stop the engines differently.
 */

class Vehical1
{
	void startEngine()
	{
		System.out.println("Strating Engine..");
	}
	
	void stopEngine()
	{
		System.out.println("Stop Engine..");
	}
}

class Car1 extends Vehical1
{
	void startEngine()
	{
		System.out.println("Strating Engine car");
	}
	
	void stopEngine()
	{
		System.out.println("Stop Engine car");
	}
}

class MotorCycle extends Car1
{
	void startEngine()
	{
		System.out.println("Strating Engine Motorcycle");
	}
	
	void stopEngine()
	{
		System.out.println("Stop Engine motorcycle");
	}
}
public class Question11 {
	public static void main(String[] args) {
		Vehical1 obj ;
		obj = new Vehical1();
		obj.startEngine();
		obj.stopEngine();
		
		obj = new Car1();
		obj.startEngine();
		obj.stopEngine();
		
		obj = new MotorCycle();
		obj.startEngine();
		obj.stopEngine();
		
	}

}
