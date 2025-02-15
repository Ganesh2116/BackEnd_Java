package weeklyTest.pkg;

/*
7. Create a class Student with two constructors – one without parameters and another with name and age. 
Use the this keyword to call one constructor from another. 
 */

class Student
{
	Student()
	{
		this("ganesh",22);
		System.out.println("This is no parameter class");
	}
	
	Student(String name,int age)
	{
		System.out.println("This is parameter class");
		System.out.println("Name of student is "+name);
		System.out.println("age of student is "+age);
	}
}



public class Question07 {
	public static void main(String[] args) {
		Student obj = new Student();
		
	}

}
