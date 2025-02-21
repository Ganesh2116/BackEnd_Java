package encapsulation.pkg;

import java.util.Scanner;

/*
 Write a Java class MobilePhone that allows setting the model and price but ensures that price is not negative.
 */

public class Question10 {
	
	private int price;
	
	Question10(int price) {
		
		if (price>0)
		{
			this.price = price;
		}
		else
		{
			System.out.println("invalid number..");;
		}
		
	}
	
	
	public int getPrice()
	{
		return price;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the price ");
		int price = sc.nextInt();
		
		Question10 obj = new Question10(price);
		
		System.out.println("price is "+obj.getPrice());
	}

}
