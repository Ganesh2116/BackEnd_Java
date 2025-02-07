package Assignment01.pkg;

// Q10.Wap to input an array and and find the sum of odd no.

public class Question10 {
	
	int inputArray(int arr[])
	{
		 int sum =0;
		 for (int  i=0;i<arr.length;i++)
		 {
			 if (arr[i]%2 != 0)
			 {
				sum += arr[i];	
			 } 
		 }
		 
		 return sum;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,45,6,7,8,9,5,4,2};
		Question10 obj = new Question10();
		int result = obj.inputArray(arr);
		
		System.out.println("Array odd number sum is :"+result);
		
	}

}
