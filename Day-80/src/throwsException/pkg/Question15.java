package throwsException.pkg;
//Handle multiple exceptions using separate catch blocks for different exception types.

public class Question15 {

	static public void print()
	{
		try {
			System.out.println(5/0);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		print();
	}
}
