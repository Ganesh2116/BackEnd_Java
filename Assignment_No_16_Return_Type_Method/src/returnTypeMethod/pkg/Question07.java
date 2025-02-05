package returnTypeMethod.pkg;

// 7. Calculate area of triangle, rectangle, square,

public class Question07 {
	double triangle(double b,double h )
	{		
		double area = 0.5*b*h;
		
		return area;
	}
	
	int square(int side)
	{		
		int area = side*side;
		return area;
	}
	
	double reactangle(int l,int w )
	{		
		double area = 0.5*l*w;
		return area;
	}
	
	
	public static void main(String[] args) {
		Question07 obj = new Question07();
	
		int  sq = obj.square(11);
		double tr = obj.triangle(11, 12.2);
		double re = obj.reactangle(11, 1);
	
		System.out.println("area of triangle is :"+tr);
		System.out.println("area of square is :"+sq);
		System.out.println("area of reactangle is :"+re);
	}
	
		
	}
	


