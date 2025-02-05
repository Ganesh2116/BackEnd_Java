package returnTypeMethod.pkg;

// 4.Wap to print the reverse of number

public class Question04 {
	
	int reverse(int num)
	{
		int rem = 0;
		int rev = 0;
		
		while (num>0)
		{
			rem = num%10;
			rev = rev*10+rem;
			num /=10;
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		Question04 obj = new Question04();
		int num = obj.reverse(1234);
		System.out.println("Reverse numbers is : "+num);
		
	}
	
}
