package inheritance.pkg;


/*
 * Wap to perform multilevel inheritance in which 

 Parent class calculate area of Triangle
Child 1 calculate area of Square
Child 2 Calculate area of Circle
 * 
 */


class Triangle
{
	void area()
	{
		int base = 10;
		int height = 20;
		
		double area = 0.5 *base*height;
		System.out.println("area of triganle is :"+area);
	}
}

class Square extends Triangle
{
	void area1()
	{
		int side = 10;
		double area = side*side;
		System.out.println("area of square is :"+area);
	}
}

class Circle extends Square
{
	void area2()
	{
		int radius = 10;
		double area = 3.14*radius*radius;
		System.out.println("area of triganle is :"+area);
	}
}

public class Question05 {
	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.area();
		obj.area1();
		obj.area2();
		
	}

}
