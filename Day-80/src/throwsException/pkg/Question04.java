package throwsException.pkg;

// 4. Handle NullPointerException when calling a method on a null object.  

public class Question04 {

	static public void print()
	{
		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		print();
	}

}
