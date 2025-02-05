package returnTypeMethod.pkg;

// 5, WAP TO PRINT FACTORIAL OF A NUMBER

public class Question05 {
	
	int factorial(int num)
	{
		int sum =1;
		for (int i=num;i>0;i--)
		{
			sum = sum*i;
			
		}
		 return sum;
	}
	
	
	public static void main(String[] args) {
		Question05 obj = new Question05();
		int fact = obj.factorial(5);
		
		System.out.println("the factorial of nunmbers is "+fact);
	}

}
