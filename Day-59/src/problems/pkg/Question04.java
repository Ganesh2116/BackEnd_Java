package problems.pkg;

/*
 
Q12.Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 

  Examples : 

  Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
  Output : 4
 */

public class Question04 {
	
	void majority(int arr[])
	{
		
		for (int i=0;i<arr.length;i++)
		{
			int count = 1;
			if (arr[i] != -1)
			{
				for (int j=i+1;j<arr.length;j++)
				{
					if (arr[i] == arr[j])
					{
						count++;
						arr[j] = -1;
						
					}
					
					if(arr.length/2 < count)
					{
						System.out.println("majority element is "+arr[i]);
						break;
					}
					
				}
			}
			
				
			
		}
	}

	public static void main(String[] args) {
		Question04 obj = new Question04();
		int arr[] =  {3, 3, 4, 2, 4, 4, 2, 4, 4};
		
		obj.majority(arr);
		
		
	}
}
