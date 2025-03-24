package throwsException.pkg;

//11. Write a program where a finally block executes after an exception occurs.  

public class Question11 {
	
	static public void print()
	{
		try {
			int num = 5/0;
			System.out.println(num);
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("excpeitons finally block print");
		}
	}
	
	public static void main(String[] args) {
		print();
	}

}
