package StringQuestionReturnTypeAssignment03.pkg;
import java.util.Arrays;
import java.util.Scanner;

// Q7.Wap enter a string and check it is anagram or not  constructor and using class and object.

public class Question07 {
	
	Question07() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String :");
		String str = sc.nextLine();
		
		System.out.println("Enter 2nd string :");
		String sstr = sc.nextLine();
		
		if (str.length() == sstr.length())
		{
			char ch[] = str.toCharArray();
			char chh[] = sstr.toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(chh);
			
			if (Arrays.equals(ch, chh))
			{
				System.out.println("This is anagram.");
			}
			else
			{
				System.out.println("This is not anagram.");
			}
		}
		else
		{
			System.out.println("Length are not same this is not anagram");
		}
	}
	
	public static void main(String[] args) {
		Question07 obj = new Question07();
	}

}
