package noreturnwithparameter.pkg;

public class AreaTriangle {
	
	void triangle(double b,double h )
	{		
		double area = 0.5*b*h;
		
		System.out.println("Area of triangle is: "+area);
	}
	
	void square(int side)
	{		
		int area = side*side;
		
		System.out.println("Area of square is: "+area);
	}
	
	void reactangle(int l,int w )
	{		
		double area = 0.5*l*w;
		
		System.out.println("Area of reactangle is: "+area);
	}
	
	void cicrle(double r)
	{		
		double area = 3.14*r*r;
		
		System.out.println("Area of cicrle is: "+area);
	}

	public static void main(String[] args) {
		AreaTriangle at = new AreaTriangle();
		at.triangle(10, 12);
		at.square(42);
		at.reactangle(12, 10);
		at.cicrle(2);
	}
}
