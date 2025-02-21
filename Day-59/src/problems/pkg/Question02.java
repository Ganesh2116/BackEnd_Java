package problems.pkg;

/*
 Q9.Given an array of integers arr[], The task is to find the index of first repeating element in it i.e. 
  the element that occurs more than once and whose index of the first occurrence is the smallest. 

Examples: 

  Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
  Output: 5 
 */

public class Question02 {
	
	int repeatingEle(int arr[])
	{
		int rep = 0;
		
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i] == arr[j] )
				{
					
					rep = j+1;
					break;
				}
				
			}
		}
		return rep;
	}
	public static void main(String[] args) {
		Question02 obj = new Question02();
		int arr[] ={10, 5, 3, 4, 3, 5, 6};
		int rep = obj.repeatingEle(arr);
		
		System.out.println("Repeating element is "+rep);
		
	}

}
