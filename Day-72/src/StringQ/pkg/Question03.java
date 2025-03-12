package StringQ.pkg;

import java.util.Arrays;
import java.util.Scanner;

// 3. Create a class that accepts an array of student names, sorts them alphabetically using a string-based approach, and prints the sorted list.  


class Student
{
	void data()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		
		String str[] = new String[size];
		
		System.out.println("Enter element stduent name ");
		for (int i=0;i<str.length;i++)
		{
			str[i] = sc.next();
		}
		
		Arrays.sort(str);
		
		System.out.println("arrays is ");
		for (int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
	
	}
}

public class Question03 {
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.data();
	}

}
