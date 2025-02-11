package pollymorphism.pkg;

/*
 Write a Java program to create a base class Shape with methods draw() and calculateArea(). 
 Create two subclasses Circle and Cylinder. Override the draw() method in each subclass to 
 draw the respective shape. In addition, override the calculateArea() method in the Cylinder 
 subclass to calculate and return the total surface area of the cylinder.
 */


class Shape2
{
	void draw()
	{
		System.out.println("draw anything..");
	}
	void calculateArea()
	{
		System.out.println("calculate area");
	}
}

class CircleShape extends Shape2
{
	void draw()
	{
		System.out.println("draw Circle shape..");
	}
	void calculateArea()
	{
		// Area= π r*r
		int radius = 12;
		double area =  3.14*radius*radius;
		System.out.println("Area of circle is "+area);
	}
}

class Cylinder extends CircleShape
{
	void draw()
	{
		System.out.println("draw cylinder...");
	}
	void calculateArea()
	{
		// CSA=2πrh
		int radius =10;
		int height = 21;
		double area =  3.14*radius*height;
		System.out.println("Area of cylinder is "+area);
	}
}
public class Question12 {
	public static void main(String[] args) {
		Shape2 obj ;
		obj = new Shape2();
		obj.draw();
		obj.calculateArea();
		
		
		obj = new CircleShape();
		obj.draw();
		obj.calculateArea();
	
		
		obj = new Cylinder();
		obj.draw();
		obj.calculateArea();
		
	}

}
