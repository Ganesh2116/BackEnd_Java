package weeklyTest.pkg;

/*
 10. Create a class DatabaseConnection with a static block that prints "Database Connected" only once when the class is loaded.
  Create multiple objects and observe the output
 */


class DatabaseConnection
{
	static 
	{
		System.out.println("DataBase Connected");
	}
}

public class Question10 {
	
	public static void main(String[] args) {
		DatabaseConnection obj = new DatabaseConnection();
		DatabaseConnection obj1 = new DatabaseConnection();

		System.out.println("this is main");
	}
}
