package abstarction.pkg;

/*
Write an abstract class Loan with an abstract method calculateEMI(). 
Implement subclasses HomeLoan and CarLoan that define their own EMI calculations.
 */

abstract class Loan
{
	abstract void calculateEMI();
}

class HomeLoan extends Loan
{
	void calculateEMI()
	{
		int lamount = 10000;
		int minterest = 4;
		int n = 12;
		int EMI = lamount*minterest*(1+minterest)*n/(1+minterest)*n-1;
		System.out.println("homeloan emi is :"+EMI);
	}
}

class CarLoan extends Loan
{
	void calculateEMI()
	{
		int lamount = 10000;
		int minterest = 2;
		int n = 10;
		int EMI = lamount*minterest*(1+minterest)*n/(1+minterest)*n-1;
		System.out.println("CarLoan emi is:"+EMI);
	}
}
public class Question12 {
	public static void main(String[] args) {
		HomeLoan obj = new HomeLoan();
		obj.calculateEMI();
		CarLoan ob = new CarLoan();
		ob.calculateEMI();
	}

}
