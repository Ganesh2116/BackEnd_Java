package weeklyTest.pkg;

/*
1. Create a base class Vehicle with attributes speed and fuelCapacity, 
and a derived class Car that adds an attribute numDoors. Write a program
 to display the details of a Car object.
 */

class Vehical
{
	int speed = 100;
	int fuleCapacity = 200;
	void speed()
	{
		System.out.println("drive safe and speed limit is"+speed);
	}
	
	void FuleCapacity()
	{
		System.out.println("fule capacity of vechical is "+fuleCapacity+"liter");
	}
}

class Car extends Vehical
{
	void numDoors()
	{
		System.out.println("car speed limit is :"+this.speed);
		System.out.println("Fule capacity is "+fuleCapacity);
	}
}
public class Question01 {
	public static void main(String[] args) {
		Car obj = new Car();
		obj.numDoors();
	}
}
