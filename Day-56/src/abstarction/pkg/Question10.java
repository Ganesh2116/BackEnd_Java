package abstarction.pkg;

/*
 Define an abstract class Device with an abstract method powerOn(). 
 Create subclasses Laptop and Mobile that implement this method.
 */


abstract class Device
{
	abstract void powerOn();
}

class Laptop extends Device
{
	void powerOn()
	{
		System.out.println("laptop powerOn");
	}
}

class Mobile extends Device
{
	void powerOn()
	{
		System.out.println("Moblie powerOn");
	}
}
public class Question10 {
	public static void main(String[] args) {
		Laptop obj = new Laptop();
		obj.powerOn();
		Mobile obj1 = new Mobile();
		obj1.powerOn();
	}

}
