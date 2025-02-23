package weeklyTestQuestion.pkg;

// 8. Implement a program that shows how this keyword is used to differentiate between 
//local and instance variables with the same name. 

class Student 
{
	int num ;
	
	void NumbersMethod()
	{
		int num= 799;
		System.out.println("this is local num is"+num);
		this.num = num;
		System.out.println("this is this num is"+this.num);
	}
}

public class Question08 {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.NumbersMethod();
	}

}
