package Questions.pkg;

// 17. The scroll held a hidden message that had to be read backward. Reverse the text.  


public class Question17 {

	void reverse(String str)
	{
		System.out.println("reverse string is :");
		
		for (int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Question17 obj = new Question17();
		String str ="this is java program";
		obj.reverse(str);
	}
}
