package Assignment01.pkg;

//Q15.Wap to input an array and and print the  sum and count of  even no.

public class Question15 {
	
	String  arrayInput(int arr[])
	{
		int sum = 0;
		int count = 0;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]%2 == 0)
			{
				sum +=arr[i];
				count++;
			}
		}
		
		String str = "sum is even number is :"+sum+" count is:"+count;
		
		return str;
	}
	
	
	public static void main(String[] args) {
		Question15 obj = new  Question15();
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		String str = obj.arrayInput(arr);
		System.out.println(str);
	}

}
