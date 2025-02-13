package SuperKeyWord.pkg;

/*
Write a program where super is used to access a parent class method when both parent 
and child have methods with the same name and parameters
 */

class Animal
{
	
	void print(int num)
	{
		System.out.println("this is parent class name useing Animal number is :"+num);
		
	}
}

class Dog extends Animal
{
	int num = 1111;
	void print(int num)
	{
		
		super.print(this.num);
		System.out.println("this is Child class name useing Dog number is :"+num);
		
	}
}
public class Question17 {
	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.print(12);
	}

}
