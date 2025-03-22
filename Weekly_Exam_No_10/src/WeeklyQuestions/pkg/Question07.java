package WeeklyQuestions.pkg;

//Q.7. Write a Java program to find the frequency of each element in an array.


public class Question07 {
	
	void frequencyEachEle(int arr[])
	{
		for (int i = 0;i<arr.length;i++)
		{
			int frecount = 0;
			for (int j= i+1;j<arr.length;j++)
			{
				if (arr[i] == arr[j])
				{
					frecount++;
				}
			}
			System.out.println("count "+arr[i]+" ele is "+frecount);
		}
	}
	
	public static void main(String[] args) {
		Question07 obj = new Question07();
		int arr[] = {1,2,3,4,5,4,3,2,1};
		obj.frequencyEachEle(arr);
	}

}
