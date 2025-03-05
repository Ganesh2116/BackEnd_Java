package String.pkg;

import java.util.Scanner;

//8.Wap enter a string and the character present at even and odd position individually

public class Question08 {
	
	void addStrChar()
	{
		String str = "ganesh bharti";
		String eStr = "";
		String oStr = "";
		
		for (int i=0;i<str.length();i++)
		{
			if (i%2 == 0)
			{
				eStr += str.charAt(i);
			}
			else
			{
				oStr += str.charAt(i);
			}
		}
		
		System.out.println("persent even position :"+eStr);
		System.out.println("persent odd position :"+oStr);
	}
	
	public static void main(String[] args) {
		Question08 obj = new Question08();
		obj.addStrChar();
	}

}
