package Questions.pkg;

//Demonstrate the use of this keyword by calling another constructor inside the same class.

public class Question08 {
	
	 Question08() {
		System.out.println("this is constructor");
	}
	 
	
	 Question08(int a) {
		 this();
			System.out.println("this is parameter constructor");
		}
		 
	 public static void main(String[] args) {
		Question08 obj = new Question08(10);
	}
}
