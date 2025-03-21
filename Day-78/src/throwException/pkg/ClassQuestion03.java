package throwException.pkg;

// Throw IllegalArgumentException if age is negative.
public class ClassQuestion03 {
	void exception()
	{ 
		int age = -18;
		
		if (age <0)
		{
			throw new IllegalArgumentException(" age is negative");
		}
		System.out.println(age);
	}
	public static void main(String[] args) {
		ClassQuestion03 obj = new ClassQuestion03();
		obj.exception();
	}

}
