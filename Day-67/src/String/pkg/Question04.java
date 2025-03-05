package String.pkg;

import java.util.Scanner;

// 4.enter a string by user and search particular character and print its no

public class Question04 {
	
	static void searchCharNo()
	{
		Scanner sc = new Scanner(System.in);
		boolean be = false;
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		
		System.out.println("Enter ther here search ele");
		char sele = sc.next().charAt(0);
		
		
		for (int i=0;i<str.length();i++)
		{
			if (sele == str.charAt(i))
			{
				System.out.println("index :"+i);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		searchCharNo();
	}

}
