package throwsException.pkg;

//6. Handle StringIndexOutOfBoundsException when accessing an invalid index of a string.  


public class Question06 {
	
	static public void print()
	{
		String str = "this is java";
		
		try {
			System.out.println(str.charAt(25));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		print();
		
	}

}
