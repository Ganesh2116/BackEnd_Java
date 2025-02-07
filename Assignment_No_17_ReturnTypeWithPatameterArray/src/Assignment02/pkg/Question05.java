package Assignment02.pkg;

// Q5.WAP to check if an array of integers contains two specified elements.

public class Question05 {
	
	String arrayInput(int a,int b)
	{
		int arr[] = {26, 1, 67, 45, 1, 78, 54, 34, 10, 1, 34};
		int acount = 0;
		int bcount = 0;
		
		for (int i=0;i<arr.length;i++)
		{
			if (a == arr[i])
			{
				acount++;
			}
			else if (b== arr[i])
			{
				bcount++;
			}
		}
		
		if (acount >=1 && bcount >=1)
		{
			return "Both are persent in array .";
		}
		else if (acount>=1)
		{
			return "Only A are persent in array .";
		}
		else if (bcount >=1)
		{
			return "Only B are persent in array.";
		}
		else 
		{
			return "both are not persent this array.";
		}
	}
	
	public static void main(String[] args) {
		Question05 obj = new Question05();
		String str = obj.arrayInput(100, 0);
		
		System.out.println(str);
		
	}

}
