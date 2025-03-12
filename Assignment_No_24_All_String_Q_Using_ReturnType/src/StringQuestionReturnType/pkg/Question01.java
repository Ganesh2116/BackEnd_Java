package StringQuestionReturnType.pkg;

import java.util.Scanner;

// 1.enter a string by user and search particular element are present or not

public class Question01 {
	
	String  persentOrNot(String str,String ele)
	{
		String word[] = str.split(" ");
		
		for (String words :word)
		{
			if (words.trim().equals(ele))
			{
				return "Element are present.";
			}
		}
		return  "Element are not present";
	}
	
	public static void main(String[] args) {
		Question01 obj = new Question01();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		
		System.out.println("Enter the find element :");
		String ele = sc.nextLine();
		
		String result = obj.persentOrNot(str, ele);
		
		System.out.println(result);
	}

}
