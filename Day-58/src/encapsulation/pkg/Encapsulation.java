package encapsulation.pkg;

import java.util.Scanner;

public class Encapsulation {
	
	private int id ;
	private String name;
	Encapsulation(int id ,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getString()
	{
		return name;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id ");
		int id = sc.nextInt();
		System.out.println("enter the name");
		String name = sc.next();
		
		Encapsulation obj = new Encapsulation(id, name);
		System.out.println(obj.getId()+" "+obj.getString());
		
		
	}

}
