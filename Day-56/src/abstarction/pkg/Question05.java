package abstarction.pkg;
/*
Create an abstract class BankAccount with an abstract method calculateInterest().
 Implement two subclasses SavingsAccount and CurrentAccount that define interest calculation differently.
 */

abstract class BankAccount
{
	abstract void calculateInterest();
}

class SavingsAccount extends BankAccount
{
	void calculateInterest()
	{
		int interest = 2;
		int amount = 10000;
		int cal = amount*interest/100;
		System.out.println("SavingAccount interest is :"+cal);
		
	}
}

class CurrentAccount extends BankAccount
{
	void calculateInterest()
	{
		int interest = 3;
		int amount = 10000;
		int cal = amount*interest/100;
		System.out.println("CurrentAccount interest is :"+cal);
	}
}
public class Question05 {
	public static void main(String[] args) {
		SavingsAccount obj = new SavingsAccount();
		CurrentAccount obj1 = new CurrentAccount();
		obj.calculateInterest();
		obj1.calculateInterest();
	}
}
