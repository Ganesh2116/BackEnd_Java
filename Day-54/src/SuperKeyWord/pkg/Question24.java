package SuperKeyWord.pkg;

/*
 Implement a Java program where an overridden method in a child class uses this and super 
 together for different purposes.
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
		str = this.str;
		print();
		System.out.println("This is instance of instance of  :"+str);
	}
}
public class Question24 {
	public static void main(String[] args) {
		AnotherClass obj = new AnotherClass();
		obj.print("rushi");
		
	}

}
