package encapsulation.pkg;

import java.util.Scanner;

/*
 Implement a Student class where the name and rollNumber are private. 
 Provide public methods to update and fetch their values.
 */
public class Question05 {
	
	private int rollnum;
	private String name;
	
	Question05(int rollnum,String name)
	{
		this.rollnum = rollnum;
		this.name = name;
	}
	
	public int getRollNum()
	{
		return rollnum;
	}
	
	public String getName()
	{
		return name;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rollnum and name");
		int rollnum = sc.nextInt();
		String name = sc.next();
		
		Question05 obj = new Question05(rollnum, name);
		System.out.println("name is"+obj.getName()+" and roll num is"+obj.getRollNum());
	}

}
