package Assignment02.pkg;

// Q6.Wap enter an array and find the duplicate element and also count of that.

public class Question06 {
	
	
	int arrayInput(int arr[])
	{
		int count = 0;
		for (int i=0;i<arr.length;i++)
		{
			for (int j =i+1;j<arr.length;j++)
			{
				if (arr[i] == arr[j])
				{
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Question06 obj = new Question06();
		int arr[] = {1,2,3,4,5,6,7,8,9,10,10,1,2,3,4,5};
		int result  = obj.arrayInput(arr);
		System.out.println("count of duplicate elements is: "+result);
	}
}
