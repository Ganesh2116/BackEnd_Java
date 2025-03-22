package WeeklyQuestions.pkg;

//Q.6.Write a Java program to find the Greatest Common Divisor (GCD) of two given
//numbers.

public class Question06 {
	
	void greatestDivisor(int num,int num1)
	{
		while( num1 != 0 )
		{
			int temp = num1;
			num1 = num % num1 ;
			num = temp ;
		}
		
		System.out.println("Greatest common divisor number is:"+num);
	}
	
	public static void main(String[] args) {
		Question06 obj = new Question06();
		obj.greatestDivisor(100, 10);
	}

}
