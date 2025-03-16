package StringQuestionReturnTypeAssignment02.pkg;

import java.util.Scanner;

// Q20.Wap enter a string and find the count of white space.


public class Question20 {
	
	int whiteSpace(String str)
	{
		int spaceCount = 0;
		
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i) == ' ') {
				spaceCount++;
			}
		}
		return spaceCount;
	}
	
	public static void main(String[] args) {
		Question20 obj = new Question20();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String here :");
		String str = sc.nextLine();
	
		int result  = obj.whiteSpace(str);
		
		System.out.println("Space count is:"+result);
	}

}
