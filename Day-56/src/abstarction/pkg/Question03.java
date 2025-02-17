package abstarction.pkg;

/*
 Develop an abstract class Employee with abstract methods calculateSalary() and displayDetails(). 
 Create subclasses PermanentEmployee and ContractEmployee to implement these methods.
 */

abstract class Employee 
{
	abstract void calculateSalary();
	abstract void displayDetails();
}

class PermanentEmployee extends Employee
{
	
	void calculateSalary()
	{
		int salary = 10000;
		int bouns = 1000;
		System.out.println("total salary is "+(salary+bouns));
	}
	
	void displayDetails()
	{
		System.out.println("Employee name is : ganesh bharti ");
		System.out.println("It depermen");
		System.out.println("this is permanent employee");
	}
}

class ContractEmployee extends Employee
{
	
	void calculateSalary()
	{
		int salary = 20000;
		int bouns = 2000;
		System.out.println("total salary is "+(salary+bouns));
	}
	
	void displayDetails()
	{
		System.out.println("Employee name is : rushi bharti ");
		System.out.println("It deperment");
		System.out.println("this is Contract employee");
	}
}
public class Question03 {
	public static void main(String[] args) {
		PermanentEmployee obj = new PermanentEmployee();
		ContractEmployee ob = new ContractEmployee();
		ob.calculateSalary();
		ob.displayDetails();
		obj.calculateSalary();
		obj.displayDetails();
	}

}
