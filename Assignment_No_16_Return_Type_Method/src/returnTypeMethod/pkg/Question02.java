package returnTypeMethod.pkg;

// 2.Wap to input a number and check it is Armstrong or not

public class Question02 {

	boolean armstrong(int num)
	{
		int numb = num;
		int sum = 0;
		int rem = 0;
		
		while (num>0)
		{
			rem = num %10;
			sum = sum+rem*rem*rem;
			num = num/10;
		}
		
		if (numb == sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Question02 qu = new Question02();
		boolean st = qu.armstrong(153);
		
		System.out.println("Armstrong number is :"+st);
	}
}
