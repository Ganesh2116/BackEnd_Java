package Assignment02.pkg;

// Q1.Wap enter an array and find the sum and count of element present at even position.

public class Question01 {
	 
		String arrayInput(int arr[])
		{
			int sum = 0;
			int count = 0;
			
			for (int i=0;i<arr.length;i++)
			{
				if ((i+1)%2 == 0)
				{
					sum += arr[i];
					count++;
				}
			}
			
			String str = "sum and count is elements present at evern postion is :" +count+" sum is"+sum;
			return str;
		}
		
		
		public static void main(String[] args) {
			Question01 obj = new Question01();
			int arr[] = {1,2,3,4,5,6,7,8,9,10};
			String str = obj.arrayInput(arr);
			System.out.println(str);
		}
}
