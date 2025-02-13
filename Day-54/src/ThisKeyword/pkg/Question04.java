package ThisKeyword.pkg;

/*
 Demonstrate the use of this to pass the current class instance to a 
 method in another class.
 */

class FirstClass
{
	String str = "ganesh";
	void print()
	{
		System.out.println("This is instance of first class :"+str);
	}
	
}

class AnotherClass extends FirstClass
{
	void print(String str)
	{
		print();
		System.out.println("This is instance of instance of  :"+str);
	}
}

public class Question04 {
	public static void main(String[] args) {
		AnotherClass obj = new AnotherClass();
		obj.print("bharti");
		
	}
	

}
