package particesSection.pkg;

import java.util.Scanner;

public class PatternQ
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of n :");
		int n = sc.nextInt();
		
		int a = 1;
		
		int b = n*n+1;
		
		for(int i = n; i >= 1; i--)
		{
			for(int j = 0; j < n-i; j++)
			{
				System.out.print("--");
			}

			for(int j = 0; j < i; j++)
			{
				System.out.print(a++ +"*");
			}
			
			for(int j = 0; j < i-1; j++)
			{
				System.out.print(b++ +"*");
			}
			System.out.println(b);
			b= b-2 * (i-1);
		}
		
	}
}