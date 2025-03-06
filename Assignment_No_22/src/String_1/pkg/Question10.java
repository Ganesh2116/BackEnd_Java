package String_1.pkg;

//10.Wap to show an example of method overloading and method overriding. using string.

class Parent{
	
	void display(String str)
	{
		System.out.println("This parent display method String :"+str);
	}
	
	void display(String str,String str1)
	{
		System.out.println("This parent display method String 1st "+str+" 2nd string "+str1);
	}
	
	void print(String str)
	{
		System.out.println("This is parent print method string is :"+str);
	}
	
}

class Child extends Parent
{
	void print(String str)
	{
		System.out.println("This is child class print method :"+str);
	}
}


public class Question10 {

	public static void main(String[] args) {
		Parent obj = new Child();
		Parent ob = new Parent();
		ob.print("ganesh ");
		obj.print("ganesh");
		obj.display("ganesh");
		obj.display("ganesh", "rushi");
		
	}

}
