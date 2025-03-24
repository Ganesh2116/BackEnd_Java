package throwsException.pkg;

//Create a program to handle ArrayIndexOutOfBoundsException when accessing an invalid index of an array


public class Question02 {
	static public void print()
	{
		int arr[] = new int[6];
		
		try {
			System.out.println(arr[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		print();
	}

}
