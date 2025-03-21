package throwException.pkg;
// Throw ArrayIndexOutOfBoundsException for an invalid array index
public class ClassQuestion05 {
	
	void exception()
	{
		int n[] = {0};
		int lenCharAt = 5;
		if (n.length<=0)
		{
			throw new IndexOutOfBoundsException(" index out length");
		}
		System.out.println(n[3]);
	}
	
	public static void main(String[] args) {
		ClassQuestion05 obj = new ClassQuestion05();
		obj.exception();
	}

}
