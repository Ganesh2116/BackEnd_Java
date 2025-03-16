package StringQuestionReturnTypeAssignment02.pkg;

import java.util.Scanner;

// Q18.Wap enter a string and use endwith() and startwith() method.


public class Question18 {
	
	String checkEndWithStartWith(String str,String cEStr,String cSStr)
	{
		boolean estr = str.endsWith(cEStr);
		boolean sStr = str.startsWith(cSStr);
		return "End with string "+estr+" Start with string is "+sStr;
	}
	
	public static void main(String[] args) {
		Question18 obj = new Question18();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String here :");
		String str = sc.nextLine();
		
		System.out.println("enter the check end word:");
		String cEStr = sc.next();
		
		System.out.println("enter the check first word:");
		String cSStr = sc.next();
		
		String result = obj.checkEndWithStartWith(str, cEStr, cSStr);
		
		System.out.println(result);
		
	}

}
