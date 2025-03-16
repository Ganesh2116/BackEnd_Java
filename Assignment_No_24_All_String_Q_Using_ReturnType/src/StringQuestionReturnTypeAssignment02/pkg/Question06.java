package StringQuestionReturnTypeAssignment02.pkg;

import java.util.Scanner;

// 6.Write a Java program to concatenate two strings.


public class Question06 {
	
	String twoJoinString(String str, String str1)
	{
		return str.concat(str1);
	}
	
	public static void main(String[] args) {
		Question06 obj = new Question06();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st String :");
		String str = sc.nextLine();
		
		System.out.println("Enter the 2nd String :");
		String str1 = sc.nextLine();
		String result = obj.twoJoinString(str, str1);
		
		System.out.println("Concatenate String is :"+result);
	}

}
