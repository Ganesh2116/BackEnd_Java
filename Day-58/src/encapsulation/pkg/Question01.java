package encapsulation.pkg;

import java.util.Scanner;

/*
 Create a class Person with private variables name and age. 
 Provide getter and setter methods to access and modify them.
 */
public class Question01 {

	private int age;
	private String name;
	Question01(int age,String name)
	{
		this.age = age;
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name and age");
		String name = sc.next();
		int age = sc.nextInt();
		Question01 obj = new Question01(age,name);
		
		System.out.println("person name "+obj.getName()+" age is "+obj.getAge());
	}
	
}
