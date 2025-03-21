package throwException.pkg;
// Throw UnsupportedOperationException for an unavailable feature.
public class ClassQuestion08 {
	
	void exception()
	{
		String str = "123abc";
		int num ;
		try {
			num = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			throw new UnsupportedOperationException(" this unavailable feature");
		}
	}
	
	
	public static void main(String[] args) {
		ClassQuestion08 obj = new ClassQuestion08();
		obj.exception();
	}

}
