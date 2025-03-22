package WeeklyQuestions.pkg;

// Q.8. Remove Duplicate Element in Array using Temporary Array

public class Question08 {
	
	void removeDuplicate(int arr[])
	{
		System.out.println("Remove Dulicate elements :");
		for (int i = 0;i<arr.length;i++)
		{
			boolean ch = false;
			for (int j= i+1;j<arr.length;j++)
			{
				if (arr[i] == arr[j])
				{
					ch = true;
				}
			}
			
			if (!ch)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Question08 obj = new Question08();
		int arr[] = {1,2,3,4,5,1,2,3};
		obj.removeDuplicate(arr);
	}

}
