package WeeklyTest.pkg;

/*
Q6.Given an array of integers. All numbers occur twice except one number which occurs once. 
Find the number in O(n) time & constant extra space.

Example : 

Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
Output: 2 

*/
public class Question06 {
	
	void onceNum(int a[])
	{
		System.out.print("Output is: ");
		for (int i=0;i<a.length;i++)
		{	
			int j;
			for (j=i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					a[j] = -1;
					break;
				}
			}
			if (j == a.length && a[i] != -1)
			{
			System.out.print(a[i]+" ");
			}
		}
		

	}
	
	public static void main(String[] args) {
		Question06 obj = new Question06();
		int arr[] = {2, 3, 5, 4, 5, 3, 4};
		obj.onceNum(arr);
		
		
		
	}

}
