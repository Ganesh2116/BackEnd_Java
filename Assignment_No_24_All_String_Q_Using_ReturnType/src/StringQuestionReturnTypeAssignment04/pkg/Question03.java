package StringQuestionReturnTypeAssignment04.pkg;

//Q3.Write a Java program to find lowest frequency character in a string.


public class Question03 {
	
	String lowestFrequencyChar(String str)
	{
		int count[] = new int[256];
		
		for (int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		
		int lowcount = 1000;
		char lowchar = ' ';
		for (int i=0;i<str.length();i++)
		{
			if (count[str.charAt(i)] < lowcount)
			{
				lowcount =count[str.charAt(i)];
				lowchar = str.charAt(i);

			}
		}
		
		return "this lowest frequency char is :"+lowchar+" frequency "+lowcount;
	}
	
	
	public static void main(String[] args) {
		Question03 obj = new Question03();
		String str ="programming";
		
		String result = obj.lowestFrequencyChar(str);
		System.out.println(result);
	}

}
