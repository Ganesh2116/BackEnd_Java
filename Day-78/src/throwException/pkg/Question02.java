package throwException.pkg;

public class Question02 {
	
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
		Question02 obj = new Question02();
		obj.exception();
	}

}
