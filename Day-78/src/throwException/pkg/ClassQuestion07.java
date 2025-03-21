package throwException.pkg;

// Throw StringIndexOutOfBoundsException for an invalid string index.
public class ClassQuestion07 {
	
	void exception()
	{
		String str[] = {"1","2"};
		
		if (str.length >2)
		{
			throw new StringIndexOutOfBoundsException(" this index not persetn in string ");
		}
		
		System.out.println(str[10]);
	}
	
	public static void main(String[] args) {
		ClassQuestion07 obj = new ClassQuestion07();
		obj.exception();
	}

}
