package Assignment01.pkg;

/*
Q13.Wap to input an array and find 
  no of 0s.
  no of positive no.
  no of negative no.  
 */

public class Question13 {
	
	String arrayInput(int arr[])
	{
		int zerocount = 0;
		int poscount = 0;
		int negcount = 0;
		
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i] == 0)
			{
				zerocount++;
			}
			else if (arr[i]>0)
			{
				poscount++;
			}
			else
			{
				negcount++;
			}
		}
		String str = "zerocount is :"+zerocount+" positive count is :"+poscount+"negative count is :"+negcount;
		return str;
	}
	
	public static void main(String[] args) {
		Question13 obj = new Question13();
		int arr2[] = {1,2,3,4,5,6,7,8,9,0,0,1,3,2,0};
		String countresult = obj.arrayInput(arr2);
		System.out.println(countresult);
	}
}
