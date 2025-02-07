package Assignment03.pkg;

// Q4. Wap enter an array and find the second max element.

public class Question04 {
		
		int secountMax(int arr[])
		{
			int max = 1;
			int semax =0;
			for (int i=0;i<arr.length;i++)
			{
				if (arr[i]>max)
				{
					semax = max;
					max = arr[i];
				}
				else if (max != arr[i] && semax < arr[i])
				{
					semax = arr[i];
				}
			}
			return semax;
		}
		
		public static void main(String[] args) {
			Question04 obj = new Question04();
			int arr[] = {12,2,3,4,5,6,7,8,10};
			int result = obj.secountMax(arr);
			
			System.out.println("2nd max is :"+result);
			
		}
}
