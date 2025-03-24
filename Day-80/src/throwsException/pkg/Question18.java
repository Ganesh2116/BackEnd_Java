package throwsException.pkg;

//Write a program that throws NullPointerException manually when a null reference is accessed.

public class Question18 {
	
	static public void print(String str) throws NullPointerException
	{
		if (str == null)
		{
			throw new NullPointerException();
		}
		else {
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		
		try {
			print(null);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
