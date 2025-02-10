package Assignment04.pkg;

// Q7.Write a java program to find prime number between an array of element.

public class Question07 {
	
	void prime(int arr[])
	{
		
		for (int i=0;i<arr.length;i++)
		{
			int count = 0;
			for (int j=1;j<=arr[i];j++)
			{
				if (arr[i]%j == 0)
				{
					count++;
				}
				
			}
			if (count == 2)
			{
				
				System.out.println(arr[i]+"This number is prime.");
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		Question07 obj = new Question07();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		obj.prime(arr);
	
	}

}
