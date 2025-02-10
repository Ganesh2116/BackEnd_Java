package inheritance.pkg;

/*
Wap to perform inheritance in which 

parent class print () method will print number from 1 to 100
Child 1 class print () method will print number from101 to 200
Child 2 class print () method will print number from 201 to 300
 */

class ParentQ1 
{
	void print()
	{
		for (int i=1;i<=100;i++)
		{
			System.out.println(i+" ");
		}
	}
}

class ChildQ1 extends ParentQ1
{
	void print1()
	{
		for (int i=101;i<=200;i++)
		{
			System.out.println(i+" ");
		}
	}
}
class ChildQ2 extends ChildQ1
{
	void print2()
	{
		for (int i=201;i<=300;i++)
		{
			System.out.println(i+" ");
		}
	}
}
public class Question01 {
		public static void main(String[] args) {
			
			ChildQ2 ch = new ChildQ2();
			ch.print();
			ch.print1();
			ch.print2();
			
		}

}
