package particesSection.pkg;

import java.util.Arrays;

public class PatternQ4 {
	
	public static void main(String[] args) {
		
		int arr[] = {10,98,3,33,12,22,21,11};
		
		Arrays.sort(arr);
		
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]%2 == 0)
			{
				System.out.print(arr[i]+" ");
			}
			
		}
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]%2 != 0)
			{
				System.out.print(arr[i]+" ");
			}
			
		}
	}

}
