package StringQuestionReturnTypeAssignment02.pkg;

import java.util.Scanner;

// Q17.Wap enter a string and check any particular string are present in it or not using contains().


public class Question17 {
	
	boolean checkStringPersentOrNot(String str,String findword)
	{
		boolean val = str.contains(findword);
		
		return val;
	}
	
	public static void main(String[] args) {
		Question17 obj = new Question17();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String here :");
		String str = sc.nextLine();
		
		System.out.println("entet the find word:");
		String fstr = sc.next();
		boolean val = obj.checkStringPersentOrNot(str, fstr);
		
		if (val)
		{
			System.out.println("word are persent in the String.");
		}
		else
		{
			System.out.println("word are not persent in the String.");
		}
	}

}
