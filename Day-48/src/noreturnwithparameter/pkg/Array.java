package noreturnwithparameter.pkg;

public class Array {
	
	void inputArray(int a[])
	{
		System.out.println("Array is:");
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		int c[] = {1,2,3,6,4,5,8,9,4,5,5,5};
		
		Array in = new Array();
		in.inputArray(c);
	}
}
