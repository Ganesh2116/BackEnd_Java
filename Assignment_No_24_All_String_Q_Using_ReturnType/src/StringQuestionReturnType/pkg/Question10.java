package StringQuestionReturnType.pkg;

// 10.Wap to show an example of method overloading and method overriding. using string.


class Teacher
{
	String str ="this is java program";
	void print()
	{
		
		System.out.println("teacher class method overriding string:"+str);
	}
}

class Stduent extends Teacher
{
	String str = "this is java program";
	void print(String str)
	{
		this.str = str;
		System.out.println("student class String is:"+str);
	}
	
	void print(String str,String str1)
	{
		this.str = str;
		System.out.println("Student class two parameter string "+str1+ " "+str);
		
	}
	
	void print()
	{
		System.out.println("student class method overriding string:"+str);
	}
}

public class Question10 {
	
	public static void main(String[] args) {
		Stduent obj = new Stduent();
		obj.print();
		obj.print("this is java program");
		obj.print("java", "program");
	
		Teacher ob = new Teacher();
		ob.print();
		
	}

}
