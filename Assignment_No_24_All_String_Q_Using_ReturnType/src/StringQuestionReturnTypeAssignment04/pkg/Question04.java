package StringQuestionReturnTypeAssignment04.pkg;

// Q4.Write a Java program to count frequency of each character in a string.

public class Question04 {
	
	void countAllfrequencyChar(String str)
	{
		int count[] =  new int[256];
		
		for (int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		
		for (int i=0;i<str.length();i++)
		{
			System.out.println("Char is :"+str.charAt(i)+" Frequency is "+count[str.charAt(i)]);
		}
	}
	
	public static void main(String[] args) {
		Question04 obj = new Question04();
		String str = "programming";
		obj.countAllfrequencyChar(str);
	}

}
