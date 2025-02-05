package returnTypeMethod.pkg;

//Write a method to calculate the simple interest given principal, rate, and time.

public class Question10 {
	
	double interest(int amo,int inte,int time)
	{
		int simInterest = amo *inte*time/100;
		return simInterest;
	}
	

	public static void main(String[] args) {
		Question10 obj = new Question10();
		
		double result = obj.interest(12, 15, 1);
		
		System.out.println("Simple interest is :"+result);
		
	}
}
