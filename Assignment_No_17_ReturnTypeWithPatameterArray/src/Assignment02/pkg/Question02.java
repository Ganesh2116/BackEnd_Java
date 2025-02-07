package Assignment02.pkg;

// Q2.Wap enter an array and find the sum and count of odd element .

public class Question02 {
	
	String arrayInput(int arr[])
	{
		int sum = 0;
		int count = 0;
		
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]%2 != 0)
			{
				sum += arr[i];
				count++;
			}
		}
		
		String str = "count of odd elements" +count+" and sum is"+sum;
		return str;
	}
	
	
	public static void main(String[] args) {
		Question02 obj = new Question02();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		String str = obj.arrayInput(arr);
		System.out.println(str);
	}

}
