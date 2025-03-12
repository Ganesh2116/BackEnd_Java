package StringQuestionReturnType.pkg;

import java.util.Scanner;

// 3.enter a string by user and convert it in upper case


public class Question03 {
	
	String convertUpperCase(String str)
	{	
		return str.toUpperCase();
	}

	public static void main(String[] args) {
		Question03 obj = new Question03();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		String result = obj.convertUpperCase(str);
		System.out.println("Upper case String is :"+result);
	}
}
