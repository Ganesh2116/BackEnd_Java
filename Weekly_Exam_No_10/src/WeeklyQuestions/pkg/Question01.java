package WeeklyQuestions.pkg;

//Q.1.Define a Java class called Rectangle with instance variables length and width. Implement
//methods to calculate the area and perimeter of the rectangle. Method Must be return type
//with argument .

public class Question01 {
		
	int len ;
	int wid ;
	int calAreaPerimeter(int len,int wid)
	{
		this.len = len;
		this.wid = wid;
		int area = 2*(len+wid);
		
		return area;
	}
	public static void main(String[] args) {
		Question01 obj =new Question01();
		int result = obj.calAreaPerimeter(10, 20);
		System.out.println("area of perimeter of rectangle is: "+result);
	}

}
