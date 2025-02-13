package ThisKeyword.pkg;

// Write a Java program to demonstrate the use of this keyword to refer 
//to instance variables when they have the same name as local variables.

class demostrate
{
	int num ;
	
	void keyword(int num)
	{
		this.num = num;
		System.out.println("number is :"+num);
	}
}
public class Question01 {
	public static void main(String[] args) {
		demostrate obj = new demostrate();
		obj.keyword(799);
	}

}
