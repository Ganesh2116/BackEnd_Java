package String.pkg;

import java.util.Scanner;

// .Write a Java program to concatenate two strings.

public class Question06 {
	
	static void conStr()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st str :");
		String str = sc.nextLine();
		
		System.out.println("Enter the 2nd str :");
		String str2 = sc.nextLine();
		
		
		System.out.println("Concat str is :"+str.concat(" "+str2));
	}
	
	public static void main(String[] args) {
		conStr();
	}

}
