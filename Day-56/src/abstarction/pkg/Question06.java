package abstarction.pkg;
/*
 Define an abstract class Appliance with an abstract method turnOn(). 
 Create subclasses Fan and WashingMachine that implement this method
 */

abstract class Appliance 
{
	abstract void turnOn();
}

class Fan extends Appliance
{
	void turnOn()
	{
		System.out.println("turn on fun");
	}
}

class WashingMachine extends Appliance
{
	void turnOn()
	{
		System.out.println("turn on washingMachine");
	}
}
public class Question06 {
	public static void main(String[] args) {
		Fan obj = new Fan();
		WashingMachine obj1 = new WashingMachine();
		obj.turnOn();
		obj1.turnOn();
	}

}
