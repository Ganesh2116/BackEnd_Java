package encapsulation.pkg;

import java.util.Scanner;

/*
 Write a Java program to create a Car class with private variables brand and price. 
 Use getter and setter methods to access them.
 */

public class Question02 {
	
	private int price;
	private String brand;
	
	Question02(int price ,String brand)
	{
		this.price = price;
		this.brand = brand;
	}
	
	public int getPrice()
	{
		return price;
		
	}
	public String getBrand()
	{
		return brand;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter brand and prices");
		String brand = sc.next();
		int price = sc.nextInt();
		
		Question02 obj = new Question02(price, brand);
		
		System.out.println("barnd is "+brand+" prices "+price);
	}

}
