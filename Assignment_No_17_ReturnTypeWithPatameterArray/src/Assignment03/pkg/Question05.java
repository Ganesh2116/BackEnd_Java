package Assignment03.pkg;

// Q5. Wap enter an array and find the second min element.

public class Question05 {

	int secountMin(int arr[])
	{
		int min = 100;
		int semin =100;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]<min)
			{
				semin = min;
				min = arr[i];
			}
			else if (min != arr[i] && semin > arr[i])
			{
				semin = arr[i];
			}
		}
		return semin;
	}
	
	public static void main(String[] args) {
		Question05 obj = new Question05();
		int arr[] = {12,2,3,4,5,6,7,8,10};
		int result = obj.secountMin(arr);
		
		System.out.println("2nd min is :"+result);
		
	}
}
