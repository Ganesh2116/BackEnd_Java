package pollymorphism.pkg;
/*
 Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). 
 Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in each
  subclass to impose different withdrawal limits and fees.
 */

class BankAccount 
{
	void deposit()
	{
		System.out.println("Deposit money in your Bank Account");
	}
	
	void withdraw()
	{
		System.out.println("withdraw money in your Bank Account");
	}
}

class SavingsAccount extends BankAccount
{
	void deposit()
	{
		System.out.println("Deposit money in your Bank Account limite is 500000.");
	}
	
	void withdraw()
	{
		System.out.println("withdraw money in your Bank Account limit is 100000");
	}
}

class CheckingAccount extends SavingsAccount
{
	void deposit()
	{
		System.out.println("Deposit money in your Bank Account fee is nothing");
	}
	
	void withdraw()
	{
		System.out.println("withdraw money in your Bank Account fee is in month 1000");
	}
}


public class Question09 {
	public static void main(String[] args) {
		BankAccount obj;
		obj = new BankAccount();
		obj.deposit();
		obj.withdraw();
		
		obj = new SavingsAccount();
		obj.deposit();
		obj.withdraw();
		
		obj = new CheckingAccount();
		obj.deposit();
		obj.withdraw();
	}

}
