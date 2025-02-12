package pollymorphism.pkg;

/*
Write a Java program to create a base class Shape with methods draw() and calculateArea(). 
Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each
 subclass to draw the respective shape, and override the calculateArea() method to calculate 
 and return the area of each shape.
 */

class Shape 
{
	void draw()
	{
		System.out.println("draw anything...");
	}
	
	void calculateArea()
	{
		System.out.println("calculate area ");
	}
}

class Circle2 extends Shape 
{
	void draw()
	{
		System.out.println("draw Circle...");
	}
	
	void calculateArea()
	{
		// Area= π r*r
		int radius = 12;
		double area =  3.14*radius*radius;
		System.out.println("Area of circle is "+area);
	}
}

class Reactangle2 extends Circle2 
{
	void draw()
	{
		System.out.println("draw reactangle..");
	}
	
	void calculateArea()
	{
		//Area= 0.5 ×Base×Height
		int base =12;
		int height = 10;
		double area = 0.5*base*height;
		System.out.println("Area of Reactangle is "+area);
	}
}

class Triangle2 extends Reactangle2
{
	void draw()
	{
		System.out.println("draw triangle");
	}
	
	void calculateArea()
	{
		//Area= 0.5 ×Base×Height
		int base =12;
		int height = 10;
		double area = 0.5*base*height;
		System.out.println("Area of Triangle is "+area);
	}
}

public class Question08 {
	public static void main(String[] args) {
		
		Shape obj ;
		obj = new Shape();
		obj.draw();
		obj.calculateArea();
		
		obj = new Circle2();
		obj.draw();
		obj.calculateArea();
		
		obj = new Reactangle2();
		obj.draw();
		obj.calculateArea();
		
		obj = new Triangle2();
		obj.draw();
		obj.calculateArea();
		
		
		
	}

}
