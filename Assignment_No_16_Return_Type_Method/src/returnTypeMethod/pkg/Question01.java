package returnTypeMethod.pkg;

// 1.Wap to input a number and check it is prime or not

public class Question01 {
	
	boolean prime(int k)
	{
		
		int count = 0;
		
		for (int i=1;i<=k;i++)
		{
			if (k%i == 0)
			{
				count++;
			}
		}
		
		if (count == 2)
		{
			return true;
		}
		else 
			return false;
	}
	
	public static void main(String[] args) {
		Question01 qu = new Question01();
		boolean k = qu.prime(11);
		
		System.out.println("This prime is :"+k);
		
	}

}
