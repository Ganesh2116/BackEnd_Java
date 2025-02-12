package pollymorphism.pkg;

import java.util.Scanner;

/*
 Write a Java program to create a class Employee with a method called 
 calculateSalary(). Create two subclasses Manager and Programmer. 
 In each subclass, override the calculateSalary() method to calculate and return 
 the salary based on their specific roles.
 */


class Employee
{
	void calculateSalary()
	{
		Scanner sc = new Scanner(System.in);
		int jrEmp = 10000;
		int srEmp = 20000;
		System.out.println("1.jr employee");
		System.out.println("2.sr employee");
		System.out.println("Enter the jr employee or sr employee:");
		int num = sc.nextInt();
		
		if (num == 1)
		{
			System.out.println("Bouns 500 and Total salary is"+(jrEmp+500));
		}
		else if (num == 2)
		{
			System.out.println("Bouns 1000 and Total salary is"+(srEmp+1000));
		}
		else
		{
			System.out.println("Invlid Employee");
		}	
	}
}


class Manager extends Employee
{
	void calculateSalary()
	{
		Scanner sc = new Scanner(System.in);
		int jrMan = 15000;
		int srMan = 25000;
		System.out.println("1.jr Manager");
		System.out.println("2.sr Manager");
		System.out.println("Enter the jr Manager or sr Manager:");
		int num = sc.nextInt();
		
		if (num == 1)
		{
			System.out.println("Bouns 500 and Total salary is"+(jrMan+500));
		}
		else if (num == 2)
		{
			System.out.println("Bouns 1000 and Total salary is"+(srMan+1000));
		}
		else
		{
			System.out.println("Invlid Manager");
		}
	}
}

class Programmer extends Manager
{
	void calculateSalary()
	{
		Scanner sc = new Scanner(System.in);
		int jrPro = 20000;
		int srPro = 30000;
		System.out.println("1.jr  Programmer");
		System.out.println("2.sr  Programmer");
		System.out.println("Enter the jr  Programmer or sr  Programmer:");
		int num = sc.nextInt();
		
		if (num == 1)
		{
			System.out.println("Bouns 500 and Total salary is"+(jrPro+500));
		}
		else if (num == 2)
		{
			System.out.println("Bouns 1000 and Total salary is"+(srPro+1000));
		}
		else
		{
			System.out.println("Invlid  Programmer");
		}
	}
}

public class Question04 {
	public static void main(String[] args) {
		Employee obj ;
		obj = new Employee();
		obj.calculateSalary();
		
		
		obj = new Manager();
		obj.calculateSalary();
		
		obj = new Programmer();
		obj.calculateSalary();
		
	}

}
