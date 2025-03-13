package ArraysQuestions.pkg;


//10..Given two sorted arrays, find their union and intersection.
//Example:
//Input: arr1[] = {1, 3, 4, 5, 7}
//      arr2[] = {2, 3, 5, 6} 
//Output: Union : {1, 2, 3, 4, 5, 6, 7} 
//       Intersection : {3, 5}

public class Question10 {
	
	void findUnion(int a[], int b[])
	{
		System.out.println("union is :");
		for(int i = 0; i< a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i = 0; i < b.length; i++)
		{	
			int count = 0;
			for(int j = 0; j < a.length; j++)
			{
				if(b[i] == a[j])
				{
					count++;
					break;
				}
			}
			if(count == 0)
			{
				System.out.print(b[i]+" ");
			}
		}
	}

	
	void intersectionArr(int arr[],int arr1[])
	{
		System.out.println("\n\nintersection arrys is:");
		for (int i =0;i<arr.length;i++)
		{
			for (int j=0;j<arr1.length;j++)
			{
				if (arr[i] == arr1[j]) 
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int  arr1[] = {1, 3, 4, 5, 7};
		int arr2[] = {2, 3, 5, 6} ;
		
		Question10 obj = new Question10();
		obj.findUnion(arr1,arr2);
		obj.intersectionArr(arr1,arr2);
		
	}

}
