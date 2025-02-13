package ThisKeyword.pkg;
/*
 Create a Java program to illustrate how this can be used to differentiate
  between instance and local variables.
 */
public class Question07 {
	
	int a = 100;
	
	void print()
	{
		int a =200;
		System.out.println("this is local variable :"+a);
		System.out.println("this is instance variable :"+this.a);
	}
	
	public static void main(String[] args) {
		Question07 obj = new Question07();
		obj.print();
	}

}
