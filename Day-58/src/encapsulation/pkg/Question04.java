package encapsulation.pkg;

import java.util.Scanner;

/*
 Create a class Employee with private variables id and salary. 
 Use setter methods to assign values and getter methods to retrieve them.
 */

public class Question04 {
	
	private int id;
	private int sal;
	
	Question04(int id,int sal)
	{
		this.id = id;
		this.sal = sal;
	}
	
	public String getId()
	{
		return "id is "+id+"salary is "+sal;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id and salary");
		int id = sc.nextInt();
		int sal = sc.nextInt();
		
		Question04 obj = new Question04(id, sal);
		System.out.println(obj.getId());
		
	}

}
