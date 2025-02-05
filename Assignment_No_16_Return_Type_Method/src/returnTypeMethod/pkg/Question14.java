package returnTypeMethod.pkg;

// Write a method to calculate the circumference of a circle given its radius.

public class Question14 {

	Double circumference(double radius)
	{
		double circum = 2 * 3.14 * radius;
		return circum;
	}
	
	public static void main(String[] args) {
		Question14 obj = new Question14();
		Double result = obj.circumference(5.2);
		
		System.out.println("circile cirsumferece is :"+result);
	}
}
