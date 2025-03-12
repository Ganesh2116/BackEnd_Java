package StringQuestionReturnType.pkg;

import java.util.Scanner;

// 4.enter a string by user and search particular character and print its no

public class Question04 {
	
	String searchParticularChar(String str,char ch)
	{
		boolean value = false;
		int num = 0;
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i) == ch)
			{
				value = true;
				num = i;
			}
		}
		
		if (value)
		{
			return "this char persent in String index of : "+num;
		}
		else
		{
			return "this is char not persent on string.";
		}
	}
	
	public static void main(String[] args) {
		Question04 obj = new Question04();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		
		System.out.println("Enter the search char :");
		char ch = sc.next().charAt(0);
		
		String result = obj.searchParticularChar(str, ch);
		System.out.println(result);
	}

}
