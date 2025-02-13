package ThisKeyword.pkg;

/*
 Create a class with a method that returns the current class instance using this.
 */


class Parent
{
	int num=100;
	int  method()
	{
		return this.num;
	}
}

public class Question02 {
	public static void main(String[] args) {
		Parent obj = new Parent();
		int num =obj.method();
		
		System.out.println("This is instance number "+num);
	}

}
