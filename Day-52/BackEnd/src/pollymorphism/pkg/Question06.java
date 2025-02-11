package pollymorphism.pkg;

/*
Write a Java program to create a class Shape with methods getArea() and getPerimeter(). 
Create three subclasses: Circle, Rectangle, and Triangle. Override the getArea() and getPerimeter()
 methods in each subclass to calculate and return the area and perimeter of the respective shapes.
 */


class Circle1
{
	void getArea()
	{
		// Area= π r*r
		int radius = 12;
		double area =  3.14*radius*radius;
		System.out.println("Area of circle is "+area);
	}
	void getPerimeter()
	{
		// Perimeter=2πr
		int radius = 12;
		double peri =  2*3.14*radius;
		System.out.println("Circle of perimeter is "+peri);
	}
}


class Reactangle1 extends Circle1
{
	void getArea()
	{
		//Area= 0.5 ×Base×Height
		int base =12;
		int height = 10;
		double area = 0.5*base*height;
		System.out.println("Area of Reactangle is "+area);
	}
	void getPerimeter()
	{
		// Perimeter=a+b+c
		int side1 = 12;
		int side2 = 12;
		int side3 = 12;
		double peri = side1+side2+side3;
		System.out.println("Reactangle of perimeter is "+peri);
	}
}

class Triangle1 extends Reactangle1
{
	void getArea()
	{
		//Area= 0.5 ×Base×Height
		int base =12;
		int height = 10;
		double area = 0.5*base*height;
		System.out.println("Area of Triangle is "+area);
	}
	
	void getPerimeter()
	{
		//Area= 0.5 ×Base×Height
		int side1 = 15;
		int side2 = 10;
		int side3 = 12;
		double peri = side1+side2+side3;
		System.out.println("Triangle of perimeter is "+peri);
	}
}

public class Question06 {
	public static void main(String[] args) {
		Circle1 obj;
		obj = new Circle1();
		obj.getArea();
		obj.getPerimeter();
		
		obj = new Reactangle1();
		obj.getArea();
		obj.getPerimeter();
		
		obj = new Triangle1();
		obj.getArea();
		obj.getPerimeter();
		
	}

}
