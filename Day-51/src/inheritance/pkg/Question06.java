package inheritance.pkg;

/*
Wap to perform overriding in which 

 Parent class calculate the perimeter of the Triangle  

Child 1 calculate the perimeter of Square
Child 2 Calculate the perimeter of Circle
 */

class Triangleperi
{
	void perimeter(int a,int b,int c)
	{
		double perimeter = a*b*c;
		System.out.println("area of triganle is :"+perimeter);
	}
}

class Squareperi extends Triangleperi
{
	void perimeter(int side)
	{
		double perimeter = 4*side;
		System.out.println("area of Square is :"+perimeter);
	}
}

class Circleperi extends Squareperi
{
	void perimeter2(double radius,double pi)
	{
		double perimeter = 3.14*pi*radius;
		System.out.println("area of Circle is :"+perimeter);
	}
}

public class Question06 {
	public static void main(String[] args) {
		
		Circleperi obj = new Circleperi();
		obj.perimeter(10, 20, 30);
		obj.perimeter(25);
		obj.perimeter2(12, 0.5);
		
	}

}
