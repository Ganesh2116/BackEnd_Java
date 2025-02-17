package abstarction.pkg;

/*
 Develop an abstract class Payment with an abstract method processPayment(). 
 Implement subclasses CreditCardPayment and CashPayment that provide specific implementations.
 */


abstract class Payment 
{
	abstract void processPayment();
}

class CreditCardPayment extends Payment
{
	void processPayment()
	{
		System.out.println("This is credit card payment method");
	}
}

class CashPayment extends Payment
{
	void processPayment()
	{
		System.out.println("This is cash payment method");
	}
}
public class Question07 {
	public static void main(String[] args) {
		CreditCardPayment obj = new CreditCardPayment();
		obj.processPayment();
		CashPayment obj1 = new CashPayment();
		obj1.processPayment();
	}

}
