package StringQuestionReturnTypeAssignment02.pkg;

import java.util.Scanner;

//2.enter a string by user and convert it in lower case


public class Question02 {
	
	String convertLowerCase(String str)
	{	
		return str.toLowerCase();
	}

	
	public static void main(String[] args) {
		Question02 obj = new Question02();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		String result = obj.convertLowerCase(str);
		System.out.println("Lower case String is :"+result);
	}
}
