package noreturnwithparameter.pkg;

public class ArraySort {
	void inputArray(int arr[])
	{
		System.out.println("Sorted Array is:");
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,5,645,12,8,6,95,4,5,1,25,5,4,5,4,5};
		ArraySort in = new ArraySort();
		in.inputArray(a);
	}
}
