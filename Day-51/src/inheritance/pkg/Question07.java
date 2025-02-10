package inheritance.pkg;

/*
 Wap to perform multilevel inheritance in which 

 Parent class calculate factorial of 2
Child 1 calculate factorial of 3
Child 2 Calculate factorial of 4
 */

class Factorial1
{
	void fast1()
	{
		int num = 2;
		int fact =1;
		for (int i=1;i<=num;i++)
		{
			fact *= i;
		}
		
		System.out.println("factorial is "+num+" "+fact);
	}
}

class Factorial2 extends Factorial1
{
	void fast2()
	{
		int num = 3;
		int fact =1;
		for (int i=1;i<=num;i++)
		{
			fact *= i;
		}
		
		System.out.println("factorial is "+num+" "+fact);
	}
}

class Factorial3 extends Factorial2
{
	void fast3()
	{
		int num = 4;
		int fact =1;
		for (int i=1;i<=num;i++)
		{
			fact *= i;
		}
		
		System.out.println("factorial is "+num+" "+fact);
	}
}

public class Question07 {
	public static void main(String[] args) {
		Factorial3 obj = new Factorial3();
		obj.fast1();
		obj.fast2();
		obj.fast3();
		
	}

}
