package returnTypeMethod.pkg;

// 8 . Perimeter of above


public class Question08 {
	
	double periTriangle(double a,double b,double c )
	{		
		double perimeter = a+b+c;
		
		return perimeter;
	}
	
	int periSquare(int side)
	{		
		int perimeter = 4*side;
		return perimeter;
	}
	
	double periCicrle(double r)
	{		
		double perimeter = 2*3.14*r*r;
		return perimeter;
		
	}
	
	double periReactangle(double l,double w )
	{		
		double perimeter = 2*l+w;
		return perimeter;
	}
	
	public static void main(String[] args) {
		Question08 obj = new Question08();
		double pc = obj.periCicrle(20);
		double pt = obj.periTriangle(12,13, 16);
		double pr = obj.periReactangle(11.2, 11.25);
		int ps = obj.periSquare(5);
		
		System.out.println("Perimeter of triangle is :"+pt);
		System.out.println("Perimeter of Square is :"+pc);
		System.out.println("Perimeter of Reactangle is :"+pr);
		System.out.println("Perimeter of circle is :"+ps);
	}
}
