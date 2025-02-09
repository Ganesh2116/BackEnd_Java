package Assignment04.pkg;
/*
Q3.Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
   Sample array: [1,2,4,5,6]
   Target value: 6.
 */
public class Question03 {
	
	
	void sumTwoEle(int arr[])
	{
		System.out.println("1st   2nd");
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]+arr[j] == 6)
				{
					System.out.println(arr[i]+"     "+arr[j]);
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Question03 obj = new Question03();
		int arr[] = {1,2,4,5,6};
		
		obj.sumTwoEle(arr);
		
		
		
	}

}
