package StringBufferStringBuilder.pkg;

// 10. Retrieve and print the character at index 2 of the StringBuffer "Java".  

public class Question10 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Java");
		System.out.println("index 2 :"+str.charAt(2));
	}
}
