package ArraysQuestions.pkg;

import java.util.Scanner;

// Implement a Java class BankAccount with attributes account number, account holder name, and balance. Include methods to deposit and withdraw money.

class BankAccount
{
    private String holderName;
    private long accountNumber;
    private double balance;

    public void details() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter holder name: ");
        holderName = sc.nextLine();

        System.out.print("Enter account number: ");
        accountNumber = sc.nextLong();

        System.out.print("Enter balance: ");
        balance = sc.nextDouble();
    }

    public void deposit() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
            System.out.println("New Balance: " + balance);
        }
        else
        {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        } 
        else if (amount > balance) 
        {
            System.out.println("Insufficient balance!");
        } 
        else
        {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    public void displayBalance() 
    {
        System.out.println("\nAccount Details:");
        System.out.println("Holder Name: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class Question06 
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
        account.details();

       System.out.println("Enter 1 for deposit and withdrawal for 2 :");
       int num = sc.nextInt();
       
       if (num == 1)
       {
    	   account.deposit();
       }
       else if (num == 2)
       {
    	   account.withdraw();
       }
       else
       {
    	   System.out.println("Invalid Input...");
       }
       
       
        account.displayBalance();
    }
}

