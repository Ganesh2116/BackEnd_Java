package weeklyTestQuestion.pkg;
//10. Write a Java program where a superclass and subclass have static variables with 
//the same name, and demonstrate how they are accessed using reference and class names.
class Parent10 
{
    static String p1 = "Parent Static Variable";
}

class Child10 extends Parent10 
{
    static String p1 = "Child Static Variable";
}



public class Question10 
{
	public static void main(String[] args) 
	{
        System.out.println("Access using class name:");
        System.out.println("Parent.name: " + Parent10.p1);
        System.out.println("Child.name: " + Child10.p1);

       
        Parent10 obj = new Child10();
        System.out.println("\nAccess using reference of Parent type:");
        System.out.println("obj.name: " + obj.p1); 

	}
}


