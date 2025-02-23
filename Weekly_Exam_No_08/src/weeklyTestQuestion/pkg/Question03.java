package weeklyTestQuestion.pkg;

//3. Create a program that shows how static methods are inherited in Java and how method hiding works with static methods.

class Teacher
{
	static void display()
	{
		System.out.println("this is techer class static method");
	}
}


class Student1 extends Teacher
{
	static void method()
	{
		
		System.out.println("this is method static");
	}
}

public class Question03 {
	
	static
	{
		System.out.println("this is static method");
	}
	
	public static void main(String[] args) {
		Student1.display();
		Student1.method();
	
		System.out.println("this is main class");
	}
	

}
