package ArraysQuestions.pkg;

//1.Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors. 
//Note: For corner elements, we need to consider only one neighbor. 
//Example:
//Input: array[]= {5, 10, 20, 15}
//Output: 20
//Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

public class Question01 {
	
	int peakElement(int array[])
	{
		for (int i=1;i<array.length;i++)
		{
			if (array[i] >= array[i+1] && array[i] >= array[i-1])
			{
				return array[i];
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Question01 obj = new Question01();
		int arr[] = {5,10,20,15};
		int result = obj.peakElement(arr);
		
		if (result != 0)
		System.out.println("peak element is:"+result);
		else {
			System.out.println("peak element is not persent ");
		}
	}
}
