package ExceptionHandling.pkg;

public class TryCatch {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		String str = null;
		System.out.println(55);
		
		try {
			System.out.println(a[8]);
			
			System.out.println(4263);
			System.out.println(456454);
			
		} 
		catch (ArithmeticException e) 
		{
			System.out.println(e);
		}
		catch (NullPointerException e) 
		{
			System.out.println(e);
		}
		catch (IndexOutOfBoundsException e) 
		{
			System.out.println(42);
			System.out.println(456);
			
			
			try {
				System.out.println(str.charAt(0));
			} 
			catch (Exception e2) 
			{
				System.out.println("nested try");
				System.out.println(e2);
				
			}
			
			System.out.println(e);
		}
		catch (Exception e) {
		
			System.out.println(e);
		}
	}

}
