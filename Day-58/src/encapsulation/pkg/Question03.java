package encapsulation.pkg;

import java.util.Scanner;

/*
 Define a class BankAccount with private attributes accountNumber and balance. 
 Implement getter methods to view the balance and account number.
 */

public class Question03 {
	
	private long accNum;
	private int balance;
	
	Question03(long accNum,int balance)
	{
		this.accNum = accNum;
		this.balance = balance;
		
	}

	public int getBalance()
	{
		return balance;
	}
	
	public long getAccNum()
	{
		return accNum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number and balance");
		long accNum = sc.nextLong();
		int balance = sc.nextInt();
		Question03 obj = new Question03(accNum,balance);
		
		
		System.out.println("Accoun number is "+obj.getAccNum()+" balances is "+obj.getBalance());
	}
}
