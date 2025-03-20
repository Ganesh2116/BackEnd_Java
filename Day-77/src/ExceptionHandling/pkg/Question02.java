package ExceptionHandling.pkg;


//Write a Java program to handle an array index out-of-bounds exception.


public class Question02 {
	
	public static void main(String[] args) {
		try {
			int a[] = {1,2,3};
			System.out.println(a[8]);
			
		} catch (IndexOutOfBoundsException e) {
		System.out.println(e);
		}
	}

}
