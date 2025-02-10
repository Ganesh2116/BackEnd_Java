package inheritance.pkg;

/*
 Wap to perform multilevel inheritance in which 

 class PrintAll will print the numbers from 1 to 100 Range 
 class EvenPrint will print the even numbers from the same range
 class OddPrint will print the odd numbers from the same range
 */
class OneTo100
{
	void print()
	{
		System.out.println("1 to 100 between numbers");
		for (int i=0;i<=100;i++)
		{
			System.out.println(i+" ");
		}
	}
}

class Even extends OneTo100
{
	void printEven()
	{
		System.out.println("1 to 100 between even numbers");
		for (int i=0;i<=100;i++)
		{
			if (i%2 == 0)
			System.out.println(i+" ");
		}
	}
}

class Odd extends Even
{
	void printOdd()
	{
		System.out.println("1 to 100 between odd numbers");
		for (int i=0;i<=100;i++)
		{
			if (i%2 != 0)
			System.out.println(i+" ");
		}
	}
}

public class Question03 {
	public static void main(String[] args) {
		Odd obj = new Odd();
		obj.print();
		obj.printEven();
		obj.printOdd();
		
	}

}
