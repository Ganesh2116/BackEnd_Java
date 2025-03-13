package particesSection.pkg;

public class PatternQ2 {
	
	void checkArraySameOrNot(int arr[],int ar[])
	{
		if (arr.length == ar.length)
		{
			int firstsum =0;
			int sesum = 0;
			for (int i=0;i<arr.length;i++)
			{
				firstsum += arr[i];
				sesum +=ar[i];
			}
			if (firstsum == sesum)
			{
				System.out.println("same array");
			}
			else
			{
				System.out.println("Not same");
			}
		}
		else
		{
			System.out.println("Aarray are not equal");
		}
	}
	
	public static void main(String[] args) {
		PatternQ2 obj = new PatternQ2();
		int arr[] = {1,2,3,4,5};
		int arr1[] = {1,2,3,4,5};
		obj.checkArraySameOrNot(arr, arr1);
	}

}
