package inheritance.pkg;

import java.util.Scanner;

/*
Wap to perform multilevel inheritance in which 

parent class will print numbers from f1 to l1 and also print sum and count
Child 1 class will print from f2 to l2 and also print sum and count
Child 2 class will print f3 to l3 and also print sum and count
 */

class ParentQ2
{
	void print()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int fnum = sc.nextInt();
		System.out.println("Enter last number:");
		int lnum = sc.nextInt();
		int count =0;
		int sum =0;
		for (int i=fnum;i<=lnum;i++)
		{
			System.out.println(i+" ");
			sum +=i;
			count++;
		}
	}
}

class ChildQ2c1 extends ParentQ2
{
	void print1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int fnum = sc.nextInt();
		System.out.println("Enter last number:");
		int lnum = sc.nextInt();
		int count =0;
		int sum =0;
		for (int i=fnum;i<=lnum;i++)
		{
			System.out.println(i+" ");
			sum +=i;
			count++;
		}
	}
}
class ChildQ2c2 extends ChildQ2c1
{
	void print2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int fnum = sc.nextInt();
		System.out.println("Enter last number:");
		int lnum = sc.nextInt();
		int count =0;
		int sum =0;
		for (int i=fnum;i<=lnum;i++)
		{
			System.out.println(i+" ");
			sum +=i;
			count++;
		}
	}
}

public class Question02 {
	public static void main(String[] args) {
		
		ChildQ2c2 obj = new ChildQ2c2();
		obj.print();
		obj.print1();
		obj.print2();
		
	}

}
