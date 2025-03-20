package ExceptionHandling.pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

// Write a Java program to catch and handle an input mismatch exception.

public class Question07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("enter the num");
			int num = sc.nextInt();
			System.out.println("num :"+num);
		} catch (InputMismatchException e) {
			System.out.println(e);
		}
	
	}
}
