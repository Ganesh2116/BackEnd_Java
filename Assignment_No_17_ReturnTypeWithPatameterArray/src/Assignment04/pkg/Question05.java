package Assignment04.pkg;

//Q.5Write a Java program to check if an array of integers contains two specified elements 65 and 77.

public class Question05 {
	
	String specifiedEle(int arr[])
	{
		int ccount =0;
		int ncount =0;
		
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i] == 65)
			{
				ccount++;
			}
			else if (arr[i] == 77)
			{
				ncount++;
			}
		}
		
		
		if (ccount >= 1 && ncount>=1)
		{
			return "Both are present in array.";
		}
		else if (ccount >= 1)
		{
			return "Only 65 present in array.";
		}
		else if (ncount >=1)
		{
			return "Only 77 present in array.";
		}
		else 
		{
			return "Both are not present in array";
		}
		
		}
			
	
	
	
	public static void main(String[] args) {
		Question05 obj = new Question05();
		int arr[] = {1,2,3,4,65,45,12};
		
		String str = obj.specifiedEle(arr);
		
		System.out.println(str);
	}

}
