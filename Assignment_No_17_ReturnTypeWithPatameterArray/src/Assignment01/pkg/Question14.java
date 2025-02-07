package Assignment01.pkg;


//Q14.Wap to input an array and find its average of first 5 element.


public class Question14 {

	int arrayInput(int arr[])
	{
		int sum = 0;
		
		for (int i=0;i<arr.length;i++)
		{
			sum +=arr[i];
		}
		int avg = sum/5;
		return avg;
	}
	
	public static void main(String[] args) {
		Question14 obj = new Question14();
		int arr1[] = {1,2,3,4,5};
		int avg = obj.arrayInput(arr1);
		System.out.println("average is first 5 elements is :"+avg);
	}
}
