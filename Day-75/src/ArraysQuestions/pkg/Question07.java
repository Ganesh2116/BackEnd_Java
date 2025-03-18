package ArraysQuestions.pkg;

// Create a class Book with attributes title, author, and price. Store an array of books and sort them by price in ascending order.

import java.util.Arrays;

class Book 
{
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) 
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public double getPrice() 
    {
        return this.price;
    }

    public void display() 
    {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }

    public static void sortBooksByPrice(Book[] books) 
    {
        Arrays.sort(books, (b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice()));
    }
}

public class Question07 
{
    public static void main(String[] args) 
    {
        Book[] books = new Book[5];
        books[0] = new Book("The Alchemist", "Paulo Coelho", 12.99);
        books[1] = new Book("Atomic Habits", "James Clear", 15.50);
        books[2] = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 10.75);
        books[3] = new Book("The Power of Now", "Eckhart Tolle", 14.20);
        books[4] = new Book("Clean Code", "Robert C. Martin", 22.00);

        System.out.println("Books :");
        for (Book book : books) {
            book.display();
        }

        Book.sortBooksByPrice(books);

        System.out.println("\nBooks sorting by price ascending order:");
        for (Book book : books) {
            book.display();
        }
    }
}

