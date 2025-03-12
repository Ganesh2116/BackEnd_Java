package StringQ.pkg;

import java.util.Scanner;

//1. Write a Java program that takes an array of strings, converts each string to uppercase using StringBuffer, and stores the results in a new array.  


public class Question01 {
	
	void convertString(String str[])
	{
		String nstr[] = new String[str.length];
			for (int i=0;i<str.length;i++)
			{
				StringBuffer s = new StringBuffer(str[i].toUpperCase());
				nstr[i] = s.toString();
			}
			
			System.out.println("uppercase string eles :");
			for (int i=0;i<nstr.length;i++)
			{
				System.out.println(nstr[i]);
			}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		
		String str[] = new String[size];
		
		System.out.println("Enter element of array ");
		for (int i=0;i<str.length;i++)
		{
			str[i] = sc.next();
		}
		
		Question01 obj = new Question01();
		obj.convertString(str);
		
	}
}
