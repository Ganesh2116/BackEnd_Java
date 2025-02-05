package returnTypeMethod.pkg;

// Write a method to check whether a given number is positive, negative, or zero.


public class Question11 {
	
	String checkNum(int num)
	{
		if (num>0)
		{
			return "this is positive number";
		}
		else if (num<0)
		{
			return "this is negaitive number";
		}
		else if (num == 0)
		{
			return "this is zero number";
		}
		else 
		{
			return "invlaid number";
		}
	}
	
	public static void main(String[] args) {
		Question11 obj = new Question11();
		String result = obj.checkNum(0);
		
		System.out.println(result);
	}

}
