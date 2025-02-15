package weeklyTest.pkg;
/*
3. Write a class MathOperations with multiple methods named multiply(), one taking two integers,
 another taking three integers, and another taking two doubles. Call all the methods in main().
 */

class MathOperations
{
	void multiply(int num)
	{
		System.out.println("this multiply 100 and answer is "+100*num);
	}
	
	void multiply(int num,int num1)
	{
		System.out.println("two varibale answer is"+num*num1);
	}
	
	void multiply(int num,int num1,int num2)
	{
		System.out.println("three variable Answer is"+num*num1*num2);
	}
}
public class Question03 {
	public static void main(String[] args) {
		MathOperations obj = new MathOperations();
		obj.multiply(20);
		obj.multiply(10, 20);
		obj.multiply(10,20,30);
	}

}
