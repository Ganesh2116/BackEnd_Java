package weeklyTest.pkg;

/*
 9. Create an abstract class Shape with an abstract method area(). 
 Implement two subclasses Circle and Rectangle that override the area() method. 
 Create objects and call the area() method.  
 */

class Shape
{
	
	int radius = 100;
	int length = 10;
	int width = 20;
	
	void area(int radius)
	{
		double area = 3.14*radius*radius;
		System.out.println("area of circle is "+area);
	}
	
	void area(int length,int width)
	{
		
		double area = length*width;
		System.out.println("area of Reactangle is "+area);
	}
}

class Circle extends Shape
{
	
	void area(int radius)
	{
		super.radius = radius;
		super.area(radius);
	}
	
}

class Reactangle extends Circle
{
	void area(int length,int width)
	{
		super.length = length;
		super.width = width;
		super.area(length, width);
	}
}
public class Question09 {
	public static void main(String[] args) {
		Reactangle obj = new Reactangle();
		obj.area(10);
		obj.area(12, 14);
		
	}

}
