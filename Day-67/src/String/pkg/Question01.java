package String.pkg;

import java.util.Scanner;

// 1.enter a string by user and search particular element are present or not

public class Question01 {
	
	static void search()
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
				be = true;
			}
			
		}
		
		if (be == true)
		{
			System.out.println("Element are present");
		}
		else
		{
			System.out.println("Element are not present");
		}
	}
	
	public static void main(String[] args) {
		search();
	}

}
