package String.pkg;

import java.util.Scanner;

// 3.enter a string by user and convert it in upper case

public class Question03 {
	
	static void cUpperCase()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter here string :");
		String str = sc.nextLine();
		
		System.out.println("Upper case string :"+str.toUpperCase());
	}
	
	public static void main(String[] args) {
		cUpperCase();
	}

}
