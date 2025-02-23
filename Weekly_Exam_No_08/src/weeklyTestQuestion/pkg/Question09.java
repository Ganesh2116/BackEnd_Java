package weeklyTestQuestion.pkg;

//9. Create a class with a method that returns the current class instance using this keyword and use it to call another method.


class P1
{
	P1 getInstance()
	{
		System.out.println("this parent class");
		return this;
	}
	
	void display()
	{
		System.out.println("this is display method");
	}
}
public class Question09 {
	public static void main(String[] args) {
		P1 obj = new P1();
		obj.display();
		obj.getInstance();
	}

}
