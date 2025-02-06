package returnTypeMethod.pkg;

// 6.Check if a year is leap
public class Question06 {
	
	String leapYear(int num)
	{
		
		if (num%100 == 0)
		{
			if (num % 400 == 0 )
			{
				return "This year is leap year.";
			}
			else 
			{
				return "This year is not  leap year.";
			}
		}
		else
		{
			 if (num % 4 == 0 )
				{
					return "This year is leap year.";
				}
				else 
				{
					return "This year is not  leap year.";
				}
		}
	}
	public static void main(String[] args) {
		Question06 obj = new Question06();
		String leapyear = obj.leapYear(2000);
		
		System.out.println(leapyear);
	}

}
