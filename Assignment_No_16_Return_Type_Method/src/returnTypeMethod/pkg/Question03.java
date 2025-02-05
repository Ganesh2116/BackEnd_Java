package returnTypeMethod.pkg;

// 3.Wap to input a number and check it is pallindrome or not

public class Question03 {

	String pallindrome(int num)
	{
		int numb = num;
		int rem = 0;
		int rev = 0;
		
		while(num>0)
		{
			rem = num%10;
			rev = rev*10+rem;
			num /=10;
		}
		
		if (numb == rev)
		{
			return "This is pallindrome";
		}
		else
		{
			return "This is not pallindrome";
		}
	}
	
	public static void main(String[] args) {
		Question03 obj = new Question03();
		String st = obj.pallindrome(121);
		System.out.println(st);
	}
}
