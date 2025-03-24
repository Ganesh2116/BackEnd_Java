package throwsException.pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

//Write a program that reads an integer from the user using Scanner and handles InputMismatchException if the user enters a non-integer value.
public class Question07 {
	
	static public void print()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the number here");
			int num = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) {
		print();
	}

}
