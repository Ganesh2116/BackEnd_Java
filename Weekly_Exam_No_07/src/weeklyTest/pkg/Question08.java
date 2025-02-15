package weeklyTest.pkg;

/*
 8. Create a base class Employee with a constructor initializing name and salary. 
 Create a subclass Manager that calls the parent class constructor using super and 
 adds an additional bonus attribute.
 */

class Employee
{
	String name = "ganesh";
	int sal = 20000;
	 Employee()
	 {
		System.err.println("this constructor"); 
	 }
}

class Manager extends Employee
{
	void bouns()
	{
		int bouns =5000;
		System.out.println("Name is employee "+super.name);
		System.err.println("Bouns and salary is "+(super.sal+bouns));
	}
}
public class Question08 {
	public static void main(String[] args) {
		Manager obj = new Manager();
		obj.bouns();
	}

}
