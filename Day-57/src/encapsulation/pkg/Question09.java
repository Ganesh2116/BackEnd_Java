package encapsulation.pkg;

import java.util.Scanner;

/*
 Create a Laptop class with private attributes brand, processor, and price. 
 Implement methods to set and get these values.
 */
public class Question09 {

	private String brand;
	private String processor;
	private int price;
	
	public Question09(String brand,String processor,int price) {
		this.brand = brand;
		this.processor = processor;
		this.price = price;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public String getPro()
	{
		return processor;
	}
	public int  getPrice() {
		return price;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the brand and processor");
		String brand = sc.next();
		String processor = sc.next();
		System.out.println("Enter the prices ");
		int price = sc.nextInt();
		Question09 obj = new Question09(brand ,processor , price);
		System.out.println("barnd name "+obj.getBrand()+" processor name "+obj.getPro()+" prices is"+obj.getPrice());
	}
}
