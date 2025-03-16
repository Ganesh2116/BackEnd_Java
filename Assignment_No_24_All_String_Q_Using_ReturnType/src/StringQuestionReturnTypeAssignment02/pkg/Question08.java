package StringQuestionReturnTypeAssignment02.pkg;

import java.util.Scanner;

// 8.Wap enter a string and the character present at even and odd position individually.


public class Question08 {
	
		StringBuffer putPostionsIndividually(String str,String str1,int posStr,char ch,int posCh)
		{
			StringBuffer addStr = new StringBuffer(str);
			addStr.insert(posStr, " "+str1);
			addStr.insert(posCh, " "+ch);
			
			return addStr;
		}
	
	
	public static void main(String[] args) {
		Question08 obj = new Question08();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		
		System.out.println("Enter the added String :");
		String str1 = sc.next();
		
		System.out.println("Enter the  String postion :");
		int posStr= sc.nextInt();
		
		System.out.println("Enter the add char :");
		char ch = sc.next().charAt(0);
		
		System.out.println("Enter the pos :");
		int posCh = sc.nextInt();
		
		StringBuffer result = obj.putPostionsIndividually(str,str1,posStr,ch,posCh);
		
		System.out.println("Now String is :"+result);
	}

}
