package ThisKeyword.pkg;
/*
 Implement a Java program where this is used to return the current object 
 from a method.
 */
class Student
{
	int rollNum = 21;
	String name = "ganesh";
}

class implement extends Student
{
	int object() {
		return this.rollNum;
		
	}
}

public class Question05 {
	
	public static void main(String[] args) {
		implement obj = new implement();
		int number = obj.object();
		
		System.out.println("return is :"+number);
		
	}
	

}
