package encapsulation.pkg;

import java.util.Scanner;

/*
 Write a program that prevents setting negative values for the age attribute in an EncapsulationDemo class.
 */

public class Question07 {

	private int age;
	
	Question07(int age) {
		if (age>0)
		{
			this.age = age;
		}
		else
		{
			this.age = 0;
		}
	}
	
	public int getAge()
	{
		return age;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age here");
		int age = sc.nextInt();
		
		Question07 obj = new Question07(age);
		System.out.println("age "+obj.getAge());
	}
}
