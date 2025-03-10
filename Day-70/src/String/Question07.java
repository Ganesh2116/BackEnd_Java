package String;

//7. Split a sentence into words and display the words in reverse order.  


public class Question07 {
	
	void reverseOrder(String str)
	{
		String s[] = str.split(" ");
		
		for (int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
	}

	public static void main(String[] args) {
		Question07 obj = new Question07();
		String str ="this is java program";
		obj.reverseOrder(str);
	}
}
