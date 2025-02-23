package weeklyTestQuestion.pkg;


//Write a program where a class contains both instance and static variables, and demonstrate how they are accessed using the this and class name.  

class DerviedClass
{
	int num = 100;
	
	void print()
	{
		System.out.println("instace variable "+this.num);
	}
	static int num1 =200;
}

public class Question04 {

	public static void main(String[] args) {
		DerviedClass obj = new DerviedClass();
		obj.print();
		System.out.println("this static variable "+DerviedClass.num1);
		
		
	}

}
