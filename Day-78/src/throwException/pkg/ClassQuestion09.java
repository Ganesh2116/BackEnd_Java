package throwException.pkg;
// 9. Throw ClassCastException when performing an invalid typecast.  

public class ClassQuestion09 {
	
	void exception()
	{
		Object ob = "ganesh";
		
		try {
			int num = (int)(ob);
		} catch (ClassCastException e) {
			throw new ClassCastException(" Invalid typecast");
		}
	}

	public static void main(String[] args) {
		ClassQuestion09 obj = new ClassQuestion09();
		obj.exception();
	}
}
