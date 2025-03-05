package String.pkg;

import java.util.Scanner;

// enter a string by user and convert it in lower case

public class Question02 {
	
	static void cLowerCase()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter here string :");
		String str = sc.nextLine();
		
		System.out.println("Lower case string :"+str.toLowerCase());
	}
	
	public static void main(String[] args) {
		cLowerCase();
	}

}
