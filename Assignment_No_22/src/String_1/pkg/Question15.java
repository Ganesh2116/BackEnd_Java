package String_1.pkg;

//.Wap enter a string and and remove last character and print final string.

public class Question15 {
	public static void main(String[] args) {
		String str = "hello world";
		System.out.println("String is :"+str);
		System.out.println("Final String :"+str.substring(0,str.length()-1));
	}

}
