package inheritance.pkg;
/*
 * 
Wap to perform multilevel inheritance in which 

 class parent will print the numbers from first to last  Range , range is taken from user
 class  will print the even numbers from first1 to last1  Range , range is taken from user
 class OddPrint will print the odd numbers from first3 to last3  Range , range is taken from user
and also find count and sum
 */

import java.util.Scanner;

class OneTo100User
{
	void print()
	{
		System.out.println("1 to 100 between numbers");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int fnum = sc.nextInt();
		System.out.println("Enter last number:");
		int lnum = sc.nextInt();
		System.out.println("1 to 100 between numbers");
		for (int i=fnum;i<=lnum;i++)
		{
			System.out.println(i+" ");
		}
		
		
	}
}

class EvenUser extends OneTo100User
{
	void printEven()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int fnum = sc.nextInt();
		System.out.println("Enter last number:");
		int lnum = sc.nextInt();
		System.out.println("1 to 100 between numbers");
		for (int i=fnum;i<=lnum;i++)
		{
			if (i%2 == 0)
			System.out.println(i+" ");
		}
	}
}

class OddUser extends EvenUser
{
	void printOdd()
	{
		int sum =0;
		int count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int fnum = sc.nextInt();
		System.out.println("Enter last number:");
		int lnum = sc.nextInt();
		System.out.println("1 to 100 between numbers");
		for (int i=fnum;i<=lnum;i++)
		{
			if (i%2 != 0)
			System.out.println(i+" ");
			sum+=i;
			count++;
		}
		
		System.out.println("sum is"+sum);
		System.out.println("count is"+count);
	}
}

public class Question04 {
	public static void main(String[] args) {
		OddUser obj = new OddUser();
		obj.print();
		obj.printEven();
		obj.printOdd();
	}

}
