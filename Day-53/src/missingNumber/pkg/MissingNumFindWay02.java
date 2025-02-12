package missingNumber.pkg;

import java.util.Arrays;

class Missing
{
	void missArrayNum()
	{
		int arr[] = {-10,-1,1,2,3,4,6,7,8,9};
		
		int count =1;
		
	System.out.println("Array is "+Arrays.toString(arr));	
	Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]<0)
			{
				continue;
			}
			else if (arr[i] == count)
			{
				count++;
			}
			else 
			{
				break;
			}
		}
		
		System.out.println("missing number is:"+count);
	}
}


public class MissingNumFindWay02 {
	public static void main(String[] args) {
		Missing ob = new Missing();
		ob.missArrayNum();
	}

}
