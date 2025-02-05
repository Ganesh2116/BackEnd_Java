package returnWithParameter.pkg;

public class Area {
	
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
	
	double cicrle(double r)
	{		
		double area = 3.14*r*r;
		return area;
		
	}
	
	
	public static void main(String[] args) {
		Area ar = new Area();
		double cr = ar.cicrle(12.2);
		int  sq = ar.square(11);
		double tr = ar.triangle(11, 12.2);
		double re = ar.reactangle(11, 1);
		
		System.out.println("area of circrle is :"+cr);
		System.out.println("area of triangle is :"+tr);
		System.out.println("area of square is :"+sq);
		System.out.println("area of reactangle is :"+re);
		
		
	}

}
