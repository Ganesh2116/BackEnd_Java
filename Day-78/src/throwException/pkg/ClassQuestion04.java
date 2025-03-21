package throwException.pkg;
// Throw NumberFormatException for invalid number conversion.
public class ClassQuestion04 {
	
	void exception()
	{
		String str = "123abc";

		if (!str.matches("-?\\d+"))
		{
			throw new NumberFormatException(" invalid number conversion.");
		}
		int num = Integer.parseInt(str);
		System.out.println(num);
	}

	public static void main(String[] args) {
		ClassQuestion04 obj = new ClassQuestion04();
		obj.exception();
		
	}
}
