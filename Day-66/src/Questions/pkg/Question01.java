package Questions.pkg;

// Write a Java program to create a class Car with attributes brand and price. Use encapsulation to set and get values.

class Car 
{
	private String brand = "TATA";
	private int price = 100000;
	
	Car()
	{
		this.price = price;
		this.brand = brand;
	}
		
	public String getBrand()
	{
		return brand;
	}
	
	public int getPrice()
	{
		return price;
	}
}

public class Question01 {
	public static void main(String[] args) {
		Car obj = new Car();
		String brand  =obj.getBrand();
		int price = obj.getPrice();
		
		System.out.println("Brand Name is:"+brand);
		System.out.println("prices is :"+price);

	}
	
}