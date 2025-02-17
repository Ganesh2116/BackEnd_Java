package abstarction.pkg;

/*
Create an abstract class Shape with an abstract method calculateArea(). 
Derive two classes Circle and Rectangle that implement this method.
*/


abstract class Shape
{
	abstract void calculateArea();
	
}


class Circle extends Shape
{
	void calculateArea()
	{
		int radius = 10;
		double area = 2*3.14*radius ; 
		System.out.println("area of circle is "+area);
	}
}

class Reactangle extends Shape
{
	void calculateArea()
	{
		int length = 10;
		int width = 20;
		double area = length*width;
		
		System.out.println("area of reactangle is :"+area);
	}
}



public class Question01 {
	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.calculateArea();
		Reactangle obj1 = new Reactangle();
		obj1.calculateArea();
		
	}

}
