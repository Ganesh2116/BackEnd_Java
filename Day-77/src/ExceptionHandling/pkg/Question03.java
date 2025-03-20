package ExceptionHandling.pkg;

public class Question03 {
	
	public static void main(String[] args) {
		try {
			
			String str = null;
			
			System.out.println(str.charAt(0));
			
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}

}
