package weeklyTestQuestion.pkg;


//7. Write a program that demonstrates how a static variable is shared across multiple 
//objects and how it differs from an instance variable. 

class StaticClass 
{
	static int var = 890;
}

class SharedClass extends StaticClass
{
	void display()
	{
		System.out.println("this is static varable"+var);
	}
}

public class Question07 {
	public static void main(String[] args) {
		SharedClass obj = new SharedClass();
		obj.display();
		
		System.out.println("this static main class called useing classname"+StaticClass.var);
	}

}
