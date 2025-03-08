package Questions.pkg;
// 20. The final challenge was to check if the given text contained only numeric values.

public class Question20 {
	
	void checkNumeric(String str)
	{
		boolean bo = true;
		
		for (int i=0;i<str.length();i++)
		{
			if ('0' > str.charAt(i)  || str.charAt(i) > '9')
			{
				bo = false;
				break;
			}
		}
		
		if (bo)
		{
			System.out.println("This String only numeric");
		}
		else
		{
			System.out.println("This String char and numeric ");
		}
	}
	
	public static void main(String[] args) {
		Question20 obj = new Question20();
		obj.checkNumeric("12345456");
		obj.checkNumeric("123ga321");
	}

}
