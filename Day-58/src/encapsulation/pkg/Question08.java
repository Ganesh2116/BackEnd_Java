package encapsulation.pkg;

import java.util.Scanner;

/*
 Modify the Car class such that the price cannot be negative. Validate this in the setter method.
 */

public class Question08 {
	
	private int price;
	
	Question08(int price)
	{
		if (price>0)
		{
			this.price = price;
		}
		else
		{
			this.price = 0;
		}
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the prices");
		int price = sc.nextInt();
		
		Question08 obj = new Question08(price);
		
		System.out.println("this is prices "+obj.getPrice());
	}

}
