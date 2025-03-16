package StringQuestionReturnTypeAssignment02.pkg;

import java.util.Scanner;

// 5.enter a string and count the no of vowel and consonent.


public class Question05 {
	
	String vowelConsonentCount(String str)
	{
		int vcount = 0;
		int ccount = 0;
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i) == 'a'|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'||str.charAt(i) == 'u'||
					str.charAt(i) == 'A'|| str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'||str.charAt(i) == 'U')
			{
				vcount++;
			}
			else
			{
				ccount++;
			}
		}
		
		return "vowel count "+vcount+" and consonent count is :"+ccount;
	}
	
	public static void main(String[] args) {
		Question05 obj = new Question05();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		String result = obj.vowelConsonentCount(str);
		
		System.out.println(result);
		
	}

}
