package ThisKeyword.pkg;

/*
 Implement a Java program where this is used as an argument 
 to a constructor of another class.
 */

public class Question09 {
	
	String name = "Ganesh Bharti";
	
	Question09()
	{
		System.out.println("this non parameter constructor ");
		System.out.println("Arugment is Name is "+this.name);
	}
	
	Question09(int num)
	{
		this();
		System.out.println("this is parameter constructor.");
	}
	
	public static void main(String[] args) {
		Question09 obj = new Question09(799);
	}

}
