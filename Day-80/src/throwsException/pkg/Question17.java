package throwsException.pkg;
//Create a method that throws IllegalArgumentException when a negative number is passed as an argument.
public class Question17 {
	
	
	static public void print(int num) throws IllegalArgumentException
	{
		if (num <0)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		
		try {
			print(-10);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
