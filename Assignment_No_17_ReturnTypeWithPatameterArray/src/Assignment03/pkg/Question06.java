package Assignment03.pkg;

//Q6. Wap enter an array and find max and min element.


public class Question06 {
	
	String maxMinEle(int arr[])
	{
		int max = 0;
		int min = 999;
		for (int i=0;i<arr.length;i++)
		{
			if (max < arr[i])
			{
				max = arr[i];
			}
			
			if (min > arr[i])
			{
				min = arr[i];
			}
		}
		
		String str = "max number is: "+max+" min number is;"+min;
		
		return str;
	}
	
	public static void main(String[] args) {
		Question06 obj = new Question06();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		String str = obj.maxMinEle(arr);
		
		System.out.println(str);
		
		
	}

}
