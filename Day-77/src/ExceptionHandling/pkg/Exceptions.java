package ExceptionHandling.pkg;

public class Exceptions {
	public static void main(String[] args) {
		
		String str = "NA";
		String str1 = null;
		System.out.println(52);
		System.out.println(53);
		System.out.println(52);
		try
		{
			System.out.println(5/0);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(52);
		System.out.println(53);
		
		System.out.println(52);
		System.out.println(53);
		System.out.println(52);
		
		try
		{
			System.out.println(str.charAt(4));
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(52);
		System.out.println(53);
		try
		{
			System.out.println(str1.charAt(4));
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
