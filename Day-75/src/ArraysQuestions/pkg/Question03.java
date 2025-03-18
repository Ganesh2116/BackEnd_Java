package ArraysQuestions.pkg;

// Create a class Product with attributes name, price, and quantity. Implement a method to calculate the total cost of a product and print it.

class Product 
{
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) 
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalCost() 
    {
        return price * quantity;
    }

    void displayTotalCost() 
    {
        System.out.println("Product: " + name);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class Question03 
{
    public static void main(String[] args) 
    {
        Product product1 = new Product("Laptop", 750.50, 2);
        product1.displayTotalCost();
    }
}
