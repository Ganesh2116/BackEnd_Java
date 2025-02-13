package SuperKeyWord.pkg;
/*
 Implement a Java program where super is used inside a constructor to avoid code duplication.
 */

public class Question18 {
	
	String name ="Codenera";

	Question18()
	{
		System.out.println("class name is "+this.name);
	}
	
	public static void main(String[] args) {
		Question18 obj = new Question18();
		
	}

}
