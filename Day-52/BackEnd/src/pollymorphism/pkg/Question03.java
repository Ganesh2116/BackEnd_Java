package pollymorphism.pkg;

/*
 Write a Java program to create a base class Shape with a method called 
 calculateArea(). Create three subclasses: Circle, Rectangle, and Triangle.
  Override the calculateArea() method in each subclass to calculate and return 
  the shape's area.
 */


class Circle
{
	void calculateArea()
	{
		// Area= π r*r
		int radius = 12;
		double area =  3.14*radius*radius;
		System.out.println("Area of circle is "+area);
	}
}


class Reactangle extends Circle
{
	void calculateArea()
	{
		//Area= 0.5 ×Base×Height
		int base =12;
		int height = 10;
		double area = 0.5*base*height;
		System.out.println("Area of Reactangle is "+area);
	}
}

class Triangle extends Reactangle
{
	void calculateArea()
	{
		//Area= 0.5 ×Base×Height
		int base =12;
		int height = 10;
		double area = 0.5*base*height;
		System.out.println("Area of Triangle is "+area);
	}
}
public class Question03 {
	
	public static void main(String[] args) {
		Circle obj ;
		obj = new Circle();
		obj.calculateArea();
		
		obj = new Reactangle();
		obj.calculateArea();
		
		obj = new Triangle();
		obj.calculateArea();
	}

}
