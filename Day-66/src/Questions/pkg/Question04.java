package Questions.pkg;
//Create an interface Vehicle with a method start(). Implement this interface in classes Bike and Car.

abstract class Vehicle
{
	abstract void start();
}

class Bike extends Vehicle
{
	void start()
	{
		System.out.println("bike start...");
	}
}

class Car1 extends Vehicle
{
	void start()
	{
		System.out.println("car start....");
	}
}

public class Question04 {
	public static void main(String[] args) {
		Vehicle obj = new Bike();
		obj.start();
		Vehicle obj1 = new Car1();
		obj1.start();
	}

}
