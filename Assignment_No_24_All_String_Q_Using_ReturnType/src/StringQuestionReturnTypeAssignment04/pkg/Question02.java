package StringQuestionReturnTypeAssignment04.pkg;

//Q2.Write a Java program to find highest frequency character in a string.


public class Question02 {
	
	
	void hightestFrequency(String str)
	{
		int count[] = new int[256];
		
		for (int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		
		int maxCount = 0;
		char maxChar = ' ';
		
		for (int i=0;i<str.length();i++)
		{
			if (count[str.charAt(i)] > maxCount)
			{
				maxCount = count[str.charAt(i)];
				maxChar = str.charAt(i);
			}
		}
		
		
		System.out.println("Highest frequency char "+maxChar+" this frequency "+maxCount);
	}
	
	
	public static void main(String[] args) {
		Question02 obj = new Question02();
		String str ="programming";
		obj.hightestFrequency(str);
	}

}





