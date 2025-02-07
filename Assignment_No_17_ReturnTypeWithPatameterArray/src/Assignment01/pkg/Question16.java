package Assignment01.pkg;

// Q16.Wap to input an array and and print the  sum and count of odd  no.

public class Question16 {
	
	String  arrayInput(int arr[])
	{
		int sum = 0;
		int count = 0;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]%2 != 0)
			{
				sum +=arr[i];
				count++;
			}
		}
		
		String str = "sum is odd number is :"+sum+" count is:"+count;
		
		return str;
	}
	
	
	public static void main(String[] args) {
		Question16 obj = new  Question16();
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		String str = obj.arrayInput(arr);
		System.out.println(str);
	}

}
