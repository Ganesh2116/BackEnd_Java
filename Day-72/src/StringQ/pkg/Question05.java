package StringQ.pkg;

import java.util.Arrays;
import java.util.Scanner;

// 5. Implement a program that replaces all occurrences of a given character in a string array using StringBuffer and prints the modified array.  


public class Question05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		
		String str[] = new String[size];
		
		System.out.println("Enter element here");
		for (int i=0;i<str.length;i++)
		{
			str[i] = sc.next();
		}
		
		char old = 'i';
		char cnew = 'p';
		
		for (int i=0;i<str.length;i++)
		{
			StringBuffer str1 = new StringBuffer(str[i]);

			for (int j=0;j<str1.length();j++)
			{
				if (str1.charAt(j) == old)
				{
					str1.setCharAt(j, cnew);
				}
			}
			str[i] = str1.toString();
		}
		
		System.out.println("The new string array is:");
		System.out.println(Arrays.toString(str));
	}

}
